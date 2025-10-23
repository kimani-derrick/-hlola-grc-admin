package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import l3.InterfaceC0970a;
/* loaded from: classes.dex */
public final class X extends F implements V {
    @Override // com.google.android.gms.internal.measurement.V
    public final void beginAdUnitExposure(String str, long j7) {
        Parcel y3 = y();
        y3.writeString(str);
        y3.writeLong(j7);
        C(y3, 23);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel y3 = y();
        y3.writeString(str);
        y3.writeString(str2);
        H.c(y3, bundle);
        C(y3, 9);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public final void endAdUnitExposure(String str, long j7) {
        Parcel y3 = y();
        y3.writeString(str);
        y3.writeLong(j7);
        C(y3, 24);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public final void generateEventId(W w7) {
        Parcel y3 = y();
        H.b(y3, w7);
        C(y3, 22);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public final void getCachedAppInstanceId(W w7) {
        Parcel y3 = y();
        H.b(y3, w7);
        C(y3, 19);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public final void getConditionalUserProperties(String str, String str2, W w7) {
        Parcel y3 = y();
        y3.writeString(str);
        y3.writeString(str2);
        H.b(y3, w7);
        C(y3, 10);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public final void getCurrentScreenClass(W w7) {
        Parcel y3 = y();
        H.b(y3, w7);
        C(y3, 17);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public final void getCurrentScreenName(W w7) {
        Parcel y3 = y();
        H.b(y3, w7);
        C(y3, 16);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public final void getGmpAppId(W w7) {
        Parcel y3 = y();
        H.b(y3, w7);
        C(y3, 21);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public final void getMaxUserProperties(String str, W w7) {
        Parcel y3 = y();
        y3.writeString(str);
        H.b(y3, w7);
        C(y3, 6);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public final void getUserProperties(String str, String str2, boolean z7, W w7) {
        Parcel y3 = y();
        y3.writeString(str);
        y3.writeString(str2);
        ClassLoader classLoader = H.f8350a;
        y3.writeInt(z7 ? 1 : 0);
        H.b(y3, w7);
        C(y3, 5);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public final void initialize(InterfaceC0970a interfaceC0970a, C0405c0 c0405c0, long j7) {
        Parcel y3 = y();
        H.b(y3, interfaceC0970a);
        H.c(y3, c0405c0);
        y3.writeLong(j7);
        C(y3, 1);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public final void logEvent(String str, String str2, Bundle bundle, boolean z7, boolean z8, long j7) {
        Parcel y3 = y();
        y3.writeString(str);
        y3.writeString(str2);
        H.c(y3, bundle);
        y3.writeInt(z7 ? 1 : 0);
        y3.writeInt(z8 ? 1 : 0);
        y3.writeLong(j7);
        C(y3, 2);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public final void logHealthData(int i7, String str, InterfaceC0970a interfaceC0970a, InterfaceC0970a interfaceC0970a2, InterfaceC0970a interfaceC0970a3) {
        Parcel y3 = y();
        y3.writeInt(i7);
        y3.writeString(str);
        H.b(y3, interfaceC0970a);
        H.b(y3, interfaceC0970a2);
        H.b(y3, interfaceC0970a3);
        C(y3, 33);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public final void onActivityCreated(InterfaceC0970a interfaceC0970a, Bundle bundle, long j7) {
        Parcel y3 = y();
        H.b(y3, interfaceC0970a);
        H.c(y3, bundle);
        y3.writeLong(j7);
        C(y3, 27);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public final void onActivityDestroyed(InterfaceC0970a interfaceC0970a, long j7) {
        Parcel y3 = y();
        H.b(y3, interfaceC0970a);
        y3.writeLong(j7);
        C(y3, 28);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public final void onActivityPaused(InterfaceC0970a interfaceC0970a, long j7) {
        Parcel y3 = y();
        H.b(y3, interfaceC0970a);
        y3.writeLong(j7);
        C(y3, 29);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public final void onActivityResumed(InterfaceC0970a interfaceC0970a, long j7) {
        Parcel y3 = y();
        H.b(y3, interfaceC0970a);
        y3.writeLong(j7);
        C(y3, 30);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public final void onActivitySaveInstanceState(InterfaceC0970a interfaceC0970a, W w7, long j7) {
        Parcel y3 = y();
        H.b(y3, interfaceC0970a);
        H.b(y3, w7);
        y3.writeLong(j7);
        C(y3, 31);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public final void onActivityStarted(InterfaceC0970a interfaceC0970a, long j7) {
        Parcel y3 = y();
        H.b(y3, interfaceC0970a);
        y3.writeLong(j7);
        C(y3, 25);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public final void onActivityStopped(InterfaceC0970a interfaceC0970a, long j7) {
        Parcel y3 = y();
        H.b(y3, interfaceC0970a);
        y3.writeLong(j7);
        C(y3, 26);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public final void registerOnMeasurementEventListener(Z z7) {
        Parcel y3 = y();
        H.b(y3, z7);
        C(y3, 35);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public final void setConditionalUserProperty(Bundle bundle, long j7) {
        Parcel y3 = y();
        H.c(y3, bundle);
        y3.writeLong(j7);
        C(y3, 8);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public final void setCurrentScreen(InterfaceC0970a interfaceC0970a, String str, String str2, long j7) {
        Parcel y3 = y();
        H.b(y3, interfaceC0970a);
        y3.writeString(str);
        y3.writeString(str2);
        y3.writeLong(j7);
        C(y3, 15);
    }

    @Override // com.google.android.gms.internal.measurement.V
    public final void setDataCollectionEnabled(boolean z7) {
        Parcel y3 = y();
        ClassLoader classLoader = H.f8350a;
        y3.writeInt(z7 ? 1 : 0);
        C(y3, 39);
    }
}
