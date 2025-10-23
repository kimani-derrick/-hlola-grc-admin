package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import r0.AbstractC1111a;
/* renamed from: com.google.android.gms.internal.measurement.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0474q implements InterfaceC0464o, Iterable {

    /* renamed from: q  reason: collision with root package name */
    public final String f8646q;

    public C0474q(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f8646q = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final Boolean c() {
        return Boolean.valueOf(!this.f8646q.isEmpty());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0474q) {
            return this.f8646q.equals(((C0474q) obj).f8646q);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final String g() {
        return this.f8646q;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final Iterator h() {
        return new C0483s(1, this);
    }

    public final int hashCode() {
        return this.f8646q.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0483s(0, this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final InterfaceC0464o l() {
        return new C0474q(this.f8646q);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0143  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.InterfaceC0464o o(java.lang.String r21, C4.b r22, java.util.ArrayList r23) {
        /*
            Method dump skipped, instructions count: 1756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0474q.o(java.lang.String, C4.b, java.util.ArrayList):com.google.android.gms.internal.measurement.o");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0464o
    public final Double r() {
        double d;
        String str = this.f8646q;
        if (str.isEmpty()) {
            d = 0.0d;
        } else {
            try {
                return Double.valueOf(str);
            } catch (NumberFormatException unused) {
                d = Double.NaN;
            }
        }
        return Double.valueOf(d);
    }

    public final String toString() {
        return AbstractC1111a.t(new StringBuilder("\""), this.f8646q, "\"");
    }
}
