package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;
import l3.InterfaceC0970a;
/* loaded from: classes.dex */
public interface V extends IInterface {
    void beginAdUnitExposure(String str, long j7);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j7);

    void endAdUnitExposure(String str, long j7);

    void generateEventId(W w7);

    void getAppInstanceId(W w7);

    void getCachedAppInstanceId(W w7);

    void getConditionalUserProperties(String str, String str2, W w7);

    void getCurrentScreenClass(W w7);

    void getCurrentScreenName(W w7);

    void getGmpAppId(W w7);

    void getMaxUserProperties(String str, W w7);

    void getSessionId(W w7);

    void getTestFlag(W w7, int i7);

    void getUserProperties(String str, String str2, boolean z7, W w7);

    void initForTests(Map map);

    void initialize(InterfaceC0970a interfaceC0970a, C0405c0 c0405c0, long j7);

    void isDataCollectionEnabled(W w7);

    void logEvent(String str, String str2, Bundle bundle, boolean z7, boolean z8, long j7);

    void logEventAndBundle(String str, String str2, Bundle bundle, W w7, long j7);

    void logHealthData(int i7, String str, InterfaceC0970a interfaceC0970a, InterfaceC0970a interfaceC0970a2, InterfaceC0970a interfaceC0970a3);

    void onActivityCreated(InterfaceC0970a interfaceC0970a, Bundle bundle, long j7);

    void onActivityDestroyed(InterfaceC0970a interfaceC0970a, long j7);

    void onActivityPaused(InterfaceC0970a interfaceC0970a, long j7);

    void onActivityResumed(InterfaceC0970a interfaceC0970a, long j7);

    void onActivitySaveInstanceState(InterfaceC0970a interfaceC0970a, W w7, long j7);

    void onActivityStarted(InterfaceC0970a interfaceC0970a, long j7);

    void onActivityStopped(InterfaceC0970a interfaceC0970a, long j7);

    void performAction(Bundle bundle, W w7, long j7);

    void registerOnMeasurementEventListener(Z z7);

    void resetAnalyticsData(long j7);

    void setConditionalUserProperty(Bundle bundle, long j7);

    void setConsent(Bundle bundle, long j7);

    void setConsentThirdParty(Bundle bundle, long j7);

    void setCurrentScreen(InterfaceC0970a interfaceC0970a, String str, String str2, long j7);

    void setDataCollectionEnabled(boolean z7);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(Z z7);

    void setInstanceIdProvider(InterfaceC0395a0 interfaceC0395a0);

    void setMeasurementEnabled(boolean z7, long j7);

    void setMinimumSessionDuration(long j7);

    void setSessionTimeoutDuration(long j7);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j7);

    void setUserProperty(String str, String str2, InterfaceC0970a interfaceC0970a, boolean z7, long j7);

    void unregisterOnMeasurementEventListener(Z z7);
}
