package com.ringcentral.paths.restapi.account.telephony.sessions.parties.hold

class Index(val parent: com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/hold"
    }

    /**
     * Operation: Hold Call Party
     * Http Post /restapi/v1.0/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/hold
     */
    fun post(): com.ringcentral.definitions.CallParty? {
        val rb: okhttp3.ResponseBody = rc.post(this.path())

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.CallParty::class.java)

    }

}
