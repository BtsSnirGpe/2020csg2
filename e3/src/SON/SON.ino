const byte PIN_BUZZER = 9;

void setup() {
  pinMode(PIN_BUZZER, OUTPUT);

  // Note "La3" 440Hz
  tone(PIN_BUZZER, 440,100); 
}

void loop() {
  
}
