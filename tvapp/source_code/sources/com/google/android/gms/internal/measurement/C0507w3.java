package com.google.android.gms.internal.measurement;
/* renamed from: com.google.android.gms.internal.measurement.w3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0507w3 implements InterfaceC0512x3 {

    /* renamed from: a  reason: collision with root package name */
    public static final R1 f8711a;

    /* renamed from: b  reason: collision with root package name */
    public static final R1 f8712b;

    /* renamed from: c  reason: collision with root package name */
    public static final R1 f8713c;

    static {
        S1 s12 = new S1(null, O1.a("com.google.android.gms.measurement"), "", "", true, false, true, false, null);
        s12.c("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f8711a = s12.c("measurement.audience.refresh_event_count_filters_timestamp", false);
        f8712b = s12.c("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f8713c = s12.c("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
}
