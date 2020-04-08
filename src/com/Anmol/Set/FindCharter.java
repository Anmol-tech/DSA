package com.Anmol.Set;

import java.util.HashSet;
import java.util.Set;

public class FindCharter {
  Set<Character> charSet = new HashSet<>();
  Set<Character> charRepeat = new HashSet<>();

  public char findChar(String str) {
    char[] chars = str.toCharArray();
    for (char ch : chars) {
      if (charSet.contains(ch)) {
        charSet.remove(ch);
        charRepeat.add(ch);
      } else charSet.add(ch);
    }

    for (char ch : chars) {
      if (charSet.contains(ch))
        return ch;
    }
    return Character.MIN_VALUE;
  }
}
