package com.rinfinity.common_module.interfaces

interface IApplicationEventProcessor {
    fun processEvent(eventParams: HashMap<String, String>)
}