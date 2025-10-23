package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class U3 implements V3 {

    /* renamed from: a  reason: collision with root package name */
    public static final R1 f8436a;

    /* renamed from: b  reason: collision with root package name */
    public static final R1 f8437b;

    /* renamed from: c  reason: collision with root package name */
    public static final R1 f8438c;
    public static final R1 d;

    /* renamed from: e  reason: collision with root package name */
    public static final R1 f8439e;

    static {
        S1 s12 = new S1(null, O1.a("com.google.android.gms.measurement"), "", "", true, false, true, false, null);
        f8436a = s12.c("measurement.test.boolean_flag", false);
        Double valueOf = Double.valueOf(-3.0d);
        Object obj = R1.f8403h;
        f8437b = new R1(s12, "measurement.test.double_flag", valueOf, 1);
        f8438c = s12.a(-2L, "measurement.test.int_flag");
        d = s12.a(-1L, "measurement.test.long_flag");
        f8439e = s12.b("measurement.test.string_flag", "---");
    }
}
