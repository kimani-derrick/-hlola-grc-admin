package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.C0407c2;
import com.google.crypto.tink.shaded.protobuf.AbstractC0530h;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: androidx.datastore.preferences.protobuf.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0226e implements Iterator {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f5755q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f5756r = 0;

    /* renamed from: s  reason: collision with root package name */
    public final int f5757s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Object f5758t;

    public C0226e(C0228g c0228g) {
        this.f5758t = c0228g;
        this.f5757s = c0228g.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5755q) {
            case 0:
                if (this.f5756r < this.f5757s) {
                    return true;
                }
                return false;
            case 1:
                if (this.f5756r < this.f5757s) {
                    return true;
                }
                return false;
            default:
                if (this.f5756r < this.f5757s) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5755q) {
            case 0:
                int i7 = this.f5756r;
                if (i7 < this.f5757s) {
                    this.f5756r = i7 + 1;
                    return Byte.valueOf(((C0228g) this.f5758t).h(i7));
                }
                throw new NoSuchElementException();
            case 1:
                int i8 = this.f5756r;
                if (i8 < this.f5757s) {
                    this.f5756r = i8 + 1;
                    return Byte.valueOf(((C0407c2) this.f5758t).g(i8));
                }
                throw new NoSuchElementException();
            default:
                int i9 = this.f5756r;
                if (i9 < this.f5757s) {
                    this.f5756r = i9 + 1;
                    return Byte.valueOf(((AbstractC0530h) this.f5758t).h(i9));
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5755q) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C0226e(C0407c2 c0407c2) {
        this.f5758t = c0407c2;
        this.f5757s = c0407c2.h();
    }

    public C0226e(AbstractC0530h abstractC0530h) {
        this.f5758t = abstractC0530h;
        this.f5757s = abstractC0530h.size();
    }
}
