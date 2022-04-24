package com.antparadox.servingwebcontent.service;

import lombok.Getter;
import lombok.NoArgsConstructor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Getter
@Service
@Slf4j
@NoArgsConstructor
public class Calculations {

   static int seconds = 1;
   static float value = 0;

   public void harmonicSeries(float antSpeed, float ropeLength, float ropeLengthIncrease){
      value = value + harmonicValue(antSpeed, ropeLength, ropeLengthIncrease, seconds);

      while(value < 1){
         log.error("seconds is " + seconds + " and initial value is " + value);
         seconds++;
         harmonicSeries(antSpeed, ropeLength, ropeLengthIncrease);

      }
   }

   public int getSeconds(){
      return seconds;
   }

   public float getValue(){
      log.error("seconds is " + seconds + " and initial value is " + value);
      return value;
   }

   private float harmonicValue(float antSpeed, float ropeLength, float ropeLengthIncrease, float round){
      return antSpeed/(ropeLength + (round*ropeLengthIncrease));
   }
}
