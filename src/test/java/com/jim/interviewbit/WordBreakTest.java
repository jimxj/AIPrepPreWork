package com.jim.interviewbit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class WordBreakTest {

    @Test
    public void testIt() {
        WordBreak wordBreak = new WordBreak();
        ArrayList dic = new ArrayList();
//        dic.addAll(Arrays.asList("aaa", "abbabbbabb", "bbaaababa", "aba", "bab", "bba", "baa", "aa", "baabaaaaa", "ababbaaaa", "aaaaaa", "b", "aaabb", "aaaaba", "babbbaaba", "b", "babbb", "bbaaaaa", "bbaaa", "baaaaaa", "aa", "aaabba", "baaabaa", "bbabbab", "abbb", "bbabbb", "aaabaaa", "a", "aaabbabbaa", "baaaaab", "baabbbab", "ba", "baab"));
//        System.out.println(wordBreak.wordBreak("baaaaabbabaaababaabbbba", dic));


        dic.clear();
        dic.addAll(Arrays.asList("baaaaaabba", "babbaababb", "abb", "bababaabab", "baaa", "ab", "ab", "bb", "abbaaaa", "bbababa", "bbbbbbab", "abbaaabba", "aaaabbab", "abaaab", "babab", "aabaaab", "aabaabbabb", "aa", "bb", "ab", "a", "a", "bbaaab", "aba", "ba", "bbabbaabab", "aaabbbbbb", "abbaaaabbb", "aabaabbaa", "bbba", "abbabbba", "abbbbabb", "bbaaba", "abbbbaab", "bba", "bbbbaabba", "ababbabaab", "baabba", "ababbaabb", "bbaab", "a", "bbba", "aaaa", "aaabbbabba", "bab", "baaaabaa", "ab", "aaabbaab", "bab", "aa", "ababababab", "aabbaaaba", "abbaaba", "bbaabaa" ));
        System.out.println(wordBreak.wordBreak("aababaaabaaababbbabbbaabababaaabbaabaabbabbaabbbbbbbabbbbabaaabaabaabbaaaaabbabaababbbabbbbbbaaaabbbaaaaaabaaaaaabbbbbbbabbbbbbbbaaabaaababbbaaaabaaaabaaaabbabbbabaabbabbabaaaabbabaaabbabbabbbabbabbaabbbabaabaabbbbbbbaabababbbbbbababbbaabaabbbabababbbbbaaaababbbabaaabaabbaababbbabbbbbaabbaaaaabbbbbaaaaaaaaaaaabbabbbabbaaabaaaaaabaabababaabaaaabaaabbbbbaaabbaabbababbabbbbaabaabaabaaaabbbaababbaabbbbbabaaababbabbbabbbbbabaababbbbbaabbbbabaabbabbababaaaabbbbabbbaaaabaabbbbaaaaababaaabaabbabaababbabbbababaaababbaabbbaaabaabbbaabbbbbbaaabaabbbbbabaaababaaabbbbbbaaaabababaaabbbbbbaabbaaabbbabaabbabababbabaabbaaabbaaabbaabbbbbababbaabbabbb", dic));

    }
}
