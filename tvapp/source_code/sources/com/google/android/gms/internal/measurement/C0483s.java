package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: com.google.android.gms.internal.measurement.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0483s implements Iterator {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f8663q;

    /* renamed from: r  reason: collision with root package name */
    public int f8664r = 0;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f8665s;

    public /* synthetic */ C0483s(int i7, Object obj) {
        this.f8663q = i7;
        this.f8665s = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f8663q) {
            case 0:
                if (this.f8664r < ((C0474q) this.f8665s).f8646q.length()) {
                    return true;
                }
                return false;
            case 1:
                if (this.f8664r < ((C0474q) this.f8665s).f8646q.length()) {
                    return true;
                }
                return false;
            default:
                if (this.f8664r < ((C0419f) this.f8665s).u()) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f8663q) {
            case 0:
                int i7 = this.f8664r;
                C0474q c0474q = (C0474q) this.f8665s;
                if (i7 < c0474q.f8646q.length()) {
                    String str = c0474q.f8646q;
                    int i8 = this.f8664r;
                    this.f8664r = i8 + 1;
                    return new C0474q(String.valueOf(str.charAt(i8)));
                }
                throw new NoSuchElementException();
            case 1:
                if (this.f8664r < ((C0474q) this.f8665s).f8646q.length()) {
                    int i9 = this.f8664r;
                    this.f8664r = i9 + 1;
                    return new C0474q(String.valueOf(i9));
                }
                throw new NoSuchElementException();
            default:
                int i10 = this.f8664r;
                C0419f c0419f = (C0419f) this.f8665s;
                if (i10 < c0419f.u()) {
                    int i11 = this.f8664r;
                    this.f8664r = i11 + 1;
                    return c0419f.s(i11);
                }
                throw new NoSuchElementException(AbstractC0515y1.l("Out of bounds index: ", this.f8664r));
        }
    }
}
