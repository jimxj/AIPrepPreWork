package com.jim.interviewbit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class MergeIntervals {

     public static class Interval {
         int start;
         int end;
         Interval() { start = 0; end = 0; }
         public Interval(int s, int e) { start = s; end = e; }

         @Override
         public String toString() {
             final StringBuilder sb = new StringBuilder("(");
             sb.append(start).append(", ").append(end).append(')');
             return sb.toString();
         }
     }


    enum PositionType {
        Before,
        Between,
        After
    }

    class Position {
        int index;
        PositionType positionType;

        public Position(int index, PositionType positionType) {
            this.index = index;
            this.positionType = positionType;
        }
    }

//    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
//        Position newStart = null;
//        Position newEnd = null;
//        ArrayList<Interval> result = new ArrayList<Interval>();
//        for (int i = 0; i < intervals.size(); i++) {
//            Interval current = intervals.get(i);
//            if (newStart == null) {
//                PositionType positionType = null;
//                if (newInterval.start < current.start) {
//                    positionType = PositionType.Before;
//                } else if (newInterval.start >= current.start && newInterval.start <= current.end) {
//                    positionType = PositionType.Between;
//                } else {
//                    if (i == intervals.size() - 1) {
//                        positionType = PositionType.After;
//                    }
//                }
//
//                if (positionType != null) {
//                    newStart = new Position(i, positionType);
//                } else {
//                    result.add(current);
//                    continue;
//                }
//            }
//
//            if (newEnd == null && newStart != null) {
//                PositionType positionType = null;
//                if (newInterval.end < current.start) {
//                    positionType = PositionType.Before;
//                } else if (newInterval.end >= current.start && newInterval.end <= current.end) {
//                    positionType = PositionType.Between;
//                } else {
//                    if (i == intervals.size() - 1) {
//                        positionType = PositionType.After;
//                    }
//                }
//
//                if (positionType != null) {
//                    newEnd = new Position(i, positionType);
//
//                    if (newStart.index == i) {   //same node
//                        if (positionType == positionType.Before) {
//                            result.add(newInterval);
//                            result.add(current);
//                        } else if (newStart.positionType == positionType.After) {
//                            result.add(current);
//                            result.add(newInterval);
//                        } else {
//                            Interval intervalCopy = new Interval();
//                            intervalCopy.start = current.start > newInterval.start ? newInterval.start : current.start;
//                            intervalCopy.end = current.end > newInterval.end ? current.end : newInterval.end;
//                            result.add(intervalCopy);
//                        }
//                    } else {
//                        Interval intervalCopy = new Interval();
//                        if (newStart.positionType == PositionType.Before || newStart.positionType == PositionType.After) {
//                            intervalCopy.start = newInterval.start;
//                        } else if (newStart.positionType == PositionType.Between){
//                            intervalCopy.start = intervals.get(newStart.index).start;
//                        }
//
//                        if (newEnd.positionType == PositionType.Before || newEnd.positionType == PositionType.After) {
//                            intervalCopy.end = newInterval.start;
//                        } else if (newEnd.positionType == PositionType.Between){
//                            intervalCopy.start = intervals.get(newEnd.index).start;
//                        }
//                        result.add(intervalCopy);
//
//                        if (newEnd.positionType == PositionType.Before) {
//                            result.add(current);
//                        }
//                    }
//                } else {
//                     if (newStart.index == i) {
//                         if (newStart.positionType == PositionType.Before) {
//                                 Interval intervalCopy = new Interval();
//                                 intervalCopy.start = newInterval.start;
//                                 intervalCopy.end = current.end;
//                                 result.add(current);
//                         } else if (newStart.positionType == PositionType.After) {
//
//                             result.add(current);
//                         }
//                     } else {
//                         //skip
//                     }
//                }
//            } else {
//                result.add(current);
//            }
//        }
//
//        return result;
//    }

    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        int size = intervals.size();
        if(size == 0) {
            intervals.add(newInterval);
            return intervals;
        }

        boolean inserted = false;
        int i = 0;
        for(; i < size; i++) {
            Interval interval = intervals.get(i);
            if(interval.start > newInterval.start) {
                intervals.add(i, newInterval);
                inserted = true;
                break;
            }
        }

        if(!inserted) {
            intervals.add(newInterval);
            ArrayList<Interval> result = new ArrayList<>(intervals);
            result.add(newInterval);
            return result;
        } else {
            return merge(intervals);
        }
    }

    public ArrayList<Interval> merge(ArrayList<Interval> a) {
        Stack<Interval> stack = new Stack<>();
        stack.push(a.get(0));
        for (int i = 1; i < a.size(); i++) {
            Interval top = stack.peek();
            Interval current = a.get(i);
            if(top.end >= current.start) {
                Interval merged = mergeOverlaps(top, current);
                stack.pop();
                stack.push(merged);
            } else {
                stack.push(current);
            }
        }
        ArrayList<Interval> result = new ArrayList<>();
        while(!stack.isEmpty()) {
            result.add(stack.pop());
        }
        Collections.reverse(result);
        return result;
    }

    private Interval mergeOverlaps(Interval a , Interval b) {
        int start = Math.min(a.start, b.start);
        int end = Math.max(a.end, b.end);
        return new Interval(start, end);
    }
}

