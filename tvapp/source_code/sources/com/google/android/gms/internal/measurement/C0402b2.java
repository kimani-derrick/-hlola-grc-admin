package com.google.android.gms.internal.measurement;

import r0.AbstractC1111a;
/* renamed from: com.google.android.gms.internal.measurement.b2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0402b2 extends C0407c2 {

    /* renamed from: u  reason: collision with root package name */
    public final int f8511u;

    /* renamed from: v  reason: collision with root package name */
    public final int f8512v;

    public C0402b2(byte[] bArr, int i7, int i8) {
        super(bArr);
        C0407c2.c(i7, i7 + i8, bArr.length);
        this.f8511u = i7;
        this.f8512v = i8;
    }

    @Override // com.google.android.gms.internal.measurement.C0407c2
    public final byte b(int i7) {
        int i8 = this.f8512v;
        if (((i8 - (i7 + 1)) | i7) < 0) {
            if (i7 < 0) {
                throw new ArrayIndexOutOfBoundsException(AbstractC0515y1.l("Index < 0: ", i7));
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC1111a.m(i7, i8, "Index > length: ", ", "));
        }
        return this.f8529r[this.f8511u + i7];
    }

    @Override // com.google.android.gms.internal.measurement.C0407c2
    public final byte g(int i7) {
        return this.f8529r[this.f8511u + i7];
    }

    @Override // com.google.android.gms.internal.measurement.C0407c2
    public final int h() {
        return this.f8512v;
    }

    @Override // com.google.android.gms.internal.measurement.C0407c2
    public final int l() {
        return this.f8511u;
    }
}
