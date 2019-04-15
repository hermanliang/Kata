package me.hermanliang.kata.util;

import java.util.List;

public class NestedInteger {

  private final Integer intValue;
  private final List<NestedInteger> listValue;

  private NestedInteger(Integer value) {
    this.intValue = value;
    this.listValue = null;
  }

  private NestedInteger(List<NestedInteger> list) {
    this.intValue = null;
    this.listValue = list;
  }

  public static NestedInteger createFromInteger(Integer value) {
    return new NestedInteger(value);
  }

  public static NestedInteger createFromList(List<NestedInteger> list) {
    return new NestedInteger(list);
  }

  public boolean isInteger() {
    return this.intValue != null;
  }

  public Integer getInteger() {
    return this.intValue;
  }

  public List<NestedInteger> getList() {
    return this.listValue;
  }
}
