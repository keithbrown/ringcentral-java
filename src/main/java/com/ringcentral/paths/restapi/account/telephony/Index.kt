package com.ringcentral.paths.restapi.account.telephony

class Index(val parent: com.ringcentral.paths.restapi.account.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/telephony"
    }


    fun callout(): com.ringcentral.paths.restapi.account.telephony.callout.Index {
        return com.ringcentral.paths.restapi.account.telephony.callout.Index(this)
    }


    fun conference(): com.ringcentral.paths.restapi.account.telephony.conference.Index {
        return com.ringcentral.paths.restapi.account.telephony.conference.Index(this)
    }


    @JvmOverloads
    fun sessions(telephonySessionId: String? = null): com.ringcentral.paths.restapi.account.telephony.sessions.Index {
        return com.ringcentral.paths.restapi.account.telephony.sessions.Index(this, telephonySessionId)
    }

}
