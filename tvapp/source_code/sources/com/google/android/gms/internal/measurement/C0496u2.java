package com.google.android.gms.internal.measurement;

import java.io.IOException;
/* renamed from: com.google.android.gms.internal.measurement.u2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0496u2 extends IOException {

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ int f8683q = 0;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.t2, java.io.IOException] */
    public static C0491t2 a() {
        return new IOException("Protocol message tag had invalid wire type.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.u2, java.io.IOException] */
    public static C0496u2 b() {
        return new IOException("Protocol message had invalid UTF-8.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.u2, java.io.IOException] */
    public static C0496u2 c() {
        return new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.u2, java.io.IOException] */
    public static C0496u2 d() {
        return new IOException("Failed to parse the message.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.u2, java.io.IOException] */
    public static C0496u2 e() {
        return new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
