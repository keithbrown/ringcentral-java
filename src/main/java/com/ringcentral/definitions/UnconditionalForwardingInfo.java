package com.ringcentral.definitions;


public class UnconditionalForwardingInfo {
    /**
     * Phone number to which the call is forwarded. In addition to common e.164 format, the following number patterns are supported: 11xxxxxxxxxxx, 444xxxxxxxxxxx, 616xxxxxxxxxxx; where xxxxxxxxxxx is a phone number in e.164 format (without '+' sign)
     */
    public String phoneNumber;
    /**
     * Event that initiates forwarding to the specified phone number
     * Enum: HoldTimeExpiration, MaxCallers, NoAnswer
     */
    public String action;

    public UnconditionalForwardingInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UnconditionalForwardingInfo action(String action) {
        this.action = action;
        return this;
    }

}
