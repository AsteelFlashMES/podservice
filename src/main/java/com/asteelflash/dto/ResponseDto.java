package com.asteelflash.dto;

/**
 * Created by hunter.fei on 2018/5/17.
 */
public class ResponseDto {
  private int result;

  private String resultMsg;

  private long serverTime;

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public String getResultMsg() {
    return resultMsg;
  }

  public void setResultMsg(String resultMsg) {
    this.resultMsg = resultMsg;
  }

  public long getServerTime() {
    return serverTime;
  }

  public void setServerTime(long serverTime) {
    this.serverTime = serverTime;
  }
}
