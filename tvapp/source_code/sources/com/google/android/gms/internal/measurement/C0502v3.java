package com.google.android.gms.internal.measurement;
/* renamed from: com.google.android.gms.internal.measurement.v3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0502v3 implements InterfaceC0487s3 {

    /* renamed from: a  reason: collision with root package name */
    public static final R1 f8701a;

    /* renamed from: b  reason: collision with root package name */
    public static final R1 f8702b;

    /* renamed from: c  reason: collision with root package name */
    public static final R1 f8703c;

    static {
        S1 s12 = new S1(null, O1.a("com.google.android.gms.measurement"), "", "", true, false, true, false, null);
        s12.c("measurement.client.ad_id_consent_fix", true);
        s12.c("measurement.service.consent.aiid_reset_fix", false);
        s12.c("measurement.service.consent.aiid_reset_fix2", true);
        f8701a = s12.c("measurement.service.consent.app_start_fix", true);
        f8702b = s12.c("measurement.service.consent.params_on_fx", true);
        f8703c = s12.c("measurement.service.consent.pfo_on_fx", true);
    }
}
