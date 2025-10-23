package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class f4 implements c4 {

    /* renamed from: a  reason: collision with root package name */
    public static final R1 f8558a;

    /* renamed from: b  reason: collision with root package name */
    public static final R1 f8559b;

    static {
        S1 s12 = new S1(null, O1.a("com.google.android.gms.measurement"), "", "", true, false, true, false, null);
        s12.c("measurement.collection.enable_session_stitching_token.client.dev", true);
        f8558a = s12.c("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        f8559b = s12.c("measurement.session_stitching_token_enabled", false);
        s12.c("measurement.link_sst_to_sid", true);
    }
}
