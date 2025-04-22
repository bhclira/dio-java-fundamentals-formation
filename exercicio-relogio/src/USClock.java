public non-sealed class USClock extends Clock {

    private String amPm;

    public void setHour(int hour) {
        this.amPm = "AM";
        if ((hour > 12) && (hour < 24)) {
            this.amPm = "PM";
            this.hour = hour - 12;
        } else if (hour >= 24){
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }
    
    
    // implements override
    @Override
    public Clock convert(final Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        switch(clock) {
            case USClock usClock -> {
                this.hour = usClock.getHour();
                this.amPm = usClock.getAmPm();
            }
            case BRLClock brlClock -> {
                this.setHour(brlClock.getHour());
            }
            
        }
        return this;
    }

    @Override
    public String getTime() {
        return super.getTime() + this.amPm;
    }

    public String getAmPm() {
        return amPm;
    }
    public void setAmPm(String amPm) {
        this.amPm = amPm;
    }
}
