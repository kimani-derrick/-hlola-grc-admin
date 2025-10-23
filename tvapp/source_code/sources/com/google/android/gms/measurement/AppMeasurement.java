package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.Keep;
import g3.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import q3.AbstractC1109a;
import q3.b;
import q3.c;
import s3.AbstractC1204v0;
import s3.C1175g0;
import s3.K0;
@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {

    /* renamed from: b  reason: collision with root package name */
    public static volatile AppMeasurement f8725b;

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1109a f8726a;

    /* loaded from: classes.dex */
    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;
    }

    public AppMeasurement(C1175g0 c1175g0) {
        this.f8726a = new b(c1175g0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:12:0x0030
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @androidx.annotation.Keep
    @java.lang.Deprecated
    public static com.google.android.gms.measurement.AppMeasurement getInstance(android.content.Context r17) {
        /*
            r0 = r17
            r1 = 1
            r2 = 0
            r3 = 2
            com.google.android.gms.measurement.AppMeasurement r4 = com.google.android.gms.measurement.AppMeasurement.f8725b
            if (r4 != 0) goto L5d
            java.lang.Class<com.google.android.gms.measurement.AppMeasurement> r4 = com.google.android.gms.measurement.AppMeasurement.class
            monitor-enter(r4)
            com.google.android.gms.measurement.AppMeasurement r5 = com.google.android.gms.measurement.AppMeasurement.f8725b     // Catch: java.lang.Throwable -> L3b
            if (r5 != 0) goto L59
            r5 = 0
            java.lang.Class<com.google.firebase.analytics.FirebaseAnalytics> r6 = com.google.firebase.analytics.FirebaseAnalytics.class
            java.lang.String r7 = "getScionFrontendApiImplementation"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L3b
            java.lang.Class<android.content.Context> r9 = android.content.Context.class
            r8[r2] = r9     // Catch: java.lang.Throwable -> L3b
            java.lang.Class<android.os.Bundle> r9 = android.os.Bundle.class
            r8[r1] = r9     // Catch: java.lang.Throwable -> L3b
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r7, r8)     // Catch: java.lang.Throwable -> L3b
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L3b
            r3[r2] = r0     // Catch: java.lang.Throwable -> L3b
            r3[r1] = r5     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r1 = r6.invoke(r5, r3)     // Catch: java.lang.Throwable -> L3b
            s3.K0 r1 = (s3.K0) r1     // Catch: java.lang.Throwable -> L3b
            goto L31
        L30:
            r1 = r5
        L31:
            if (r1 == 0) goto L3d
            com.google.android.gms.measurement.AppMeasurement r0 = new com.google.android.gms.measurement.AppMeasurement     // Catch: java.lang.Throwable -> L3b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.measurement.AppMeasurement.f8725b = r0     // Catch: java.lang.Throwable -> L3b
            goto L59
        L3b:
            r0 = move-exception
            goto L5b
        L3d:
            com.google.android.gms.internal.measurement.c0 r1 = new com.google.android.gms.internal.measurement.c0     // Catch: java.lang.Throwable -> L3b
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r7 = 0
            r9 = 0
            r11 = 1
            r12 = 0
            r6 = r1
            r6.<init>(r7, r9, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L3b
            s3.g0 r0 = s3.C1175g0.e(r0, r1, r5)     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.measurement.AppMeasurement r1 = new com.google.android.gms.measurement.AppMeasurement     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.measurement.AppMeasurement.f8725b = r1     // Catch: java.lang.Throwable -> L3b
        L59:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3b
            goto L5d
        L5b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3b
            throw r0
        L5d:
            com.google.android.gms.measurement.AppMeasurement r0 = com.google.android.gms.measurement.AppMeasurement.f8725b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.getInstance(android.content.Context):com.google.android.gms.measurement.AppMeasurement");
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f8726a.j(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f8726a.c(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f8726a.f(str);
    }

    @Keep
    public long generateEventId() {
        return this.f8726a.a();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f8726a.g();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty, java.lang.Object] */
    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        int size;
        List<Bundle> i7 = this.f8726a.i(str, str2);
        if (i7 == null) {
            size = 0;
        } else {
            size = i7.size();
        }
        ArrayList arrayList = new ArrayList(size);
        for (Bundle bundle : i7) {
            ?? obj = new Object();
            n.g(bundle);
            obj.mAppId = (String) AbstractC1204v0.a(bundle, "app_id", String.class, null);
            obj.mOrigin = (String) AbstractC1204v0.a(bundle, "origin", String.class, null);
            obj.mName = (String) AbstractC1204v0.a(bundle, "name", String.class, null);
            obj.mValue = AbstractC1204v0.a(bundle, "value", Object.class, null);
            obj.mTriggerEventName = (String) AbstractC1204v0.a(bundle, "trigger_event_name", String.class, null);
            obj.mTriggerTimeout = ((Long) AbstractC1204v0.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            obj.mTimedOutEventName = (String) AbstractC1204v0.a(bundle, "timed_out_event_name", String.class, null);
            obj.mTimedOutEventParams = (Bundle) AbstractC1204v0.a(bundle, "timed_out_event_params", Bundle.class, null);
            obj.mTriggeredEventName = (String) AbstractC1204v0.a(bundle, "triggered_event_name", String.class, null);
            obj.mTriggeredEventParams = (Bundle) AbstractC1204v0.a(bundle, "triggered_event_params", Bundle.class, null);
            obj.mTimeToLive = ((Long) AbstractC1204v0.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            obj.mExpiredEventName = (String) AbstractC1204v0.a(bundle, "expired_event_name", String.class, null);
            obj.mExpiredEventParams = (Bundle) AbstractC1204v0.a(bundle, "expired_event_params", Bundle.class, null);
            obj.mActive = ((Boolean) AbstractC1204v0.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            obj.mCreationTimestamp = ((Long) AbstractC1204v0.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            obj.mTriggeredTimestamp = ((Long) AbstractC1204v0.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(obj);
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f8726a.l();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f8726a.h();
    }

    @Keep
    public String getGmpAppId() {
        return this.f8726a.m();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f8726a.b(str);
    }

    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z7) {
        return this.f8726a.k(str, str2, z7);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f8726a.e(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        n.g(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            AbstractC1204v0.e(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.f8726a.d(bundle);
    }

    public AppMeasurement(K0 k02) {
        this.f8726a = new c(k02);
    }
}
