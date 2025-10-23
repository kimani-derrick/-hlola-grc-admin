package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class g4 implements h4 {

    /* renamed from: a  reason: collision with root package name */
    public static final R1 f8562a;

    /* renamed from: b  reason: collision with root package name */
    public static final R1 f8563b;

    static {
        S1 s12 = new S1(null, O1.a("com.google.android.gms.measurement"), "", "", true, false, true, false, null);
        s12.c("measurement.client.sessions.background_sessions_enabled", true);
        f8562a = s12.c("measurement.client.sessions.enable_fix_background_engagement", false);
        s12.c("measurement.client.sessions.immediate_start_enabled_foreground", true);
        f8563b = s12.c("measurement.client.sessions.enable_pause_engagement_in_background", true);
        s12.c("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        s12.c("measurement.client.sessions.session_id_enabled", true);
        s12.a(0L, "measurement.id.client.sessions.enable_fix_background_engagement");
    }
}
