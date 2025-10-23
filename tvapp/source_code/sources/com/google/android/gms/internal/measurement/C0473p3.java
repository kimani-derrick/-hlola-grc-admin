package com.google.android.gms.internal.measurement;
/* renamed from: com.google.android.gms.internal.measurement.p3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0473p3 implements InterfaceC0458m3 {

    /* renamed from: a  reason: collision with root package name */
    public static final R1 f8641a;

    /* renamed from: b  reason: collision with root package name */
    public static final R1 f8642b;

    /* renamed from: c  reason: collision with root package name */
    public static final R1 f8643c;
    public static final R1 d;

    static {
        S1 s12 = new S1(null, O1.a("com.google.android.gms.measurement"), "", "", true, false, true, false, null);
        s12.c("measurement.dma_consent.client", true);
        s12.c("measurement.dma_consent.client_bow_check2", true);
        f8641a = s12.c("measurement.dma_consent.separate_service_calls_fix", false);
        s12.c("measurement.dma_consent.service", true);
        f8642b = s12.c("measurement.dma_consent.service_database_update_fix", true);
        s12.c("measurement.dma_consent.service_dcu_event", true);
        f8643c = s12.c("measurement.dma_consent.service_dcu_event2", true);
        s12.c("measurement.dma_consent.service_npa_remote_default", true);
        s12.c("measurement.dma_consent.service_split_batch_on_consent", true);
        d = s12.c("measurement.dma_consent.set_consent_inline_on_worker", false);
        s12.a(0L, "measurement.id.dma_consent.separate_service_calls_fix");
    }
}
