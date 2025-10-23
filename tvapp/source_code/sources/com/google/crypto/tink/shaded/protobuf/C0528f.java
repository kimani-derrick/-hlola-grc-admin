package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import r0.AbstractC1111a;
/* renamed from: com.google.crypto.tink.shaded.protobuf.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0528f extends C0529g {

    /* renamed from: u  reason: collision with root package name */
    public final int f9114u;

    /* renamed from: v  reason: collision with root package name */
    public final int f9115v;

    public C0528f(byte[] bArr, int i7, int i8) {
        super(bArr);
        AbstractC0530h.c(i7, i7 + i8, bArr.length);
        this.f9114u = i7;
        this.f9115v = i8;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0529g, com.google.crypto.tink.shaded.protobuf.AbstractC0530h
    public final byte b(int i7) {
        int i8 = this.f9115v;
        if (((i8 - (i7 + 1)) | i7) < 0) {
            if (i7 < 0) {
                throw new ArrayIndexOutOfBoundsException(AbstractC0515y1.l("Index < 0: ", i7));
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC1111a.m(i7, i8, "Index > length: ", ", "));
        }
        return this.f9116t[this.f9114u + i7];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0529g, com.google.crypto.tink.shaded.protobuf.AbstractC0530h
    public final void g(int i7, byte[] bArr) {
        System.arraycopy(this.f9116t, this.f9114u, bArr, 0, i7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0529g, com.google.crypto.tink.shaded.protobuf.AbstractC0530h
    public final byte h(int i7) {
        return this.f9116t[this.f9114u + i7];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0529g
    public final int n() {
        return this.f9114u;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0529g, com.google.crypto.tink.shaded.protobuf.AbstractC0530h
    public final int size() {
        return this.f9115v;
    }
}
