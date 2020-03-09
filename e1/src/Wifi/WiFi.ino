#include "WiFi.h"
 
const char* ssid = "Tg";
const char* password =  "meryl971";
void setup() {
 
  Serial.begin(115200);
  WiFi.begin(ssid, password);
}
void loop(){

  if (WiFi.status() != WL_CONNECTED){
    delay(500);
    Serial.println("deco");
    Serial.println(" ");
}
  else {
      //WiFi.begin(ssid, password);
      Serial.println("Connecter");
      Serial.println( WiFi.localIP());
      Serial.println(" ");
      delay(1000);
      }
  
}
 
