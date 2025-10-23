package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.C0226e;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.Iterator;
/* renamed from: com.google.crypto.tink.shaded.protobuf.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0529g extends AbstractC0530h {

    /* renamed from: t  reason: collision with root package name */
    public final byte[] f9116t;

    public C0529g(byte[] bArr) {
        this.f9120q = 0;
        bArr.getClass();
        this.f9116t = bArr;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0530h
    public byte b(int i7) {
        return this.f9116t[i7];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0530h) || size() != ((AbstractC0530h) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C0529g) {
            C0529g c0529g = (C0529g) obj;
            int i7 = this.f9120q;
            int i8 = c0529g.f9120q;
            if (i7 != 0 && i8 != 0 && i7 != i8) {
                return false;
            }
            int size = size();
            if (size <= c0529g.size()) {
                if (size <= c0529g.size()) {
                    int n = n() + size;
                    int n7 = n();
                    int n8 = c0529g.n();
                    while (n7 < n) {
                        if (this.f9116t[n7] != c0529g.f9116t[n8]) {
                            return false;
                        }
                        n7++;
                        n8++;
                    }
                    return true;
                }
                StringBuilder o7 = AbstractC0515y1.o(size, "Ran off end of other: 0, ", ", ");
                o7.append(c0529g.size());
                throw new IllegalArgumentException(o7.toString());
            }
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        return obj.equals(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0530h
    public void g(int i7, byte[] bArr) {
        System.arraycopy(this.f9116t, 0, bArr, 0, i7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0530h
    public byte h(int i7) {
        return this.f9116t[i7];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0226e(this);
    }

    public int n() {
        return 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0530h
    public int size() {
        return this.f9116t.length;
    }
}
