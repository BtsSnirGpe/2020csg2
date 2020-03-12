#include <WiFi.h>


const char* ssid = "LUIGUY";
const char* password = "luiguy971";

void setup(){

  Serial.begin(115200);
  delay(1000);
  Serial.print("Connecting to");
  Serial.println(ssid);
  
  
  WiFi.begin(ssid, password);
  while(WiFi.status()!= WL_CONNECTED){
    delay(500);
    Serial.print("");
  }
  Serial.println("WiFi connected");
}

void loop(){

  
  
}
