package com.google.android.gms.internal.measurement;

import java.io.IOException;
/* renamed from: com.google.android.gms.internal.measurement.l2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0452l2 implements Cloneable {

    /* renamed from: q  reason: collision with root package name */
    public final AbstractC0457m2 f8608q;

    /* renamed from: r  reason: collision with root package name */
    public AbstractC0457m2 f8609r;

    public AbstractC0452l2(AbstractC0457m2 abstractC0457m2) {
        this.f8608q = abstractC0457m2;
        if (!abstractC0457m2.q()) {
            this.f8609r = (AbstractC0457m2) abstractC0457m2.g(4);
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public final AbstractC0452l2 b(AbstractC0457m2 abstractC0457m2) {
        AbstractC0457m2 abstractC0457m22 = this.f8608q;
        if (abstractC0457m22.equals(abstractC0457m2)) {
            return this;
        }
        if (!this.f8609r.q()) {
            AbstractC0457m2 abstractC0457m23 = (AbstractC0457m2) abstractC0457m22.g(4);
            AbstractC0457m2 abstractC0457m24 = this.f8609r;
            I2 i22 = I2.f8358c;
            i22.getClass();
            i22.a(abstractC0457m23.getClass()).c(abstractC0457m23, abstractC0457m24);
            this.f8609r = abstractC0457m23;
        }
        AbstractC0457m2 abstractC0457m25 = this.f8609r;
        I2 i23 = I2.f8358c;
        i23.getClass();
        i23.a(abstractC0457m25.getClass()).c(abstractC0457m25, abstractC0457m2);
        return this;
    }

    public final AbstractC0457m2 c() {
        AbstractC0457m2 d = d();
        d.getClass();
        if (AbstractC0457m2.k(d, true)) {
            return d;
        }
        throw new RuntimeException("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final /* synthetic */ Object clone() {
        AbstractC0452l2 abstractC0452l2 = (AbstractC0452l2) this.f8608q.g(5);
        abstractC0452l2.f8609r = d();
        return abstractC0452l2;
    }

    public final AbstractC0457m2 d() {
        if (this.f8609r.q()) {
            this.f8609r.o();
        }
        return this.f8609r;
    }

    public final void e() {
        if (!this.f8609r.q()) {
            AbstractC0457m2 abstractC0457m2 = (AbstractC0457m2) this.f8608q.g(4);
            AbstractC0457m2 abstractC0457m22 = this.f8609r;
            I2 i22 = I2.f8358c;
            i22.getClass();
            i22.a(abstractC0457m2.getClass()).c(abstractC0457m2, abstractC0457m22);
            this.f8609r = abstractC0457m2;
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.android.gms.internal.measurement.Z1, java.lang.Object] */
    public final void g(byte[] bArr, int i7, C0422f2 c0422f2) {
        if (!this.f8609r.q()) {
            AbstractC0457m2 abstractC0457m2 = (AbstractC0457m2) this.f8608q.g(4);
            AbstractC0457m2 abstractC0457m22 = this.f8609r;
            I2 i22 = I2.f8358c;
            i22.getClass();
            i22.a(abstractC0457m2.getClass()).c(abstractC0457m2, abstractC0457m22);
            this.f8609r = abstractC0457m2;
        }
        try {
            I2 i23 = I2.f8358c;
            AbstractC0457m2 abstractC0457m23 = this.f8609r;
            i23.getClass();
            L2 a7 = i23.a(abstractC0457m23.getClass());
            AbstractC0457m2 abstractC0457m24 = this.f8609r;
            ?? obj = new Object();
            c0422f2.getClass();
            a7.e(abstractC0457m24, bArr, 0, i7, obj);
        } catch (C0496u2 e3) {
            throw e3;
        } catch (IOException e7) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e7);
        } catch (IndexOutOfBoundsException unused) {
            throw C0496u2.e();
        }
    }
}
