package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.io.Serializable;
/* loaded from: classes.dex */
public final class S1 {

    /* renamed from: a  reason: collision with root package name */
    public Uri f8415a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8416b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8417c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public Object f8418e;
    public Serializable f;

    /* renamed from: g  reason: collision with root package name */
    public Serializable f8419g;

    /* renamed from: h  reason: collision with root package name */
    public Object f8420h;

    public S1() {
        this.f = O3.Z.f2634w;
        O3.C c5 = O3.E.f2597r;
        this.f8419g = O3.U.f2621u;
    }

    public R1 a(long j7, String str) {
        Long valueOf = Long.valueOf(j7);
        Object obj = R1.f8403h;
        return new R1(this, str, valueOf, 0);
    }

    public R1 b(String str, String str2) {
        Object obj = R1.f8403h;
        return new R1(this, str, str2, 3);
    }

    public R1 c(String str, boolean z7) {
        Boolean valueOf = Boolean.valueOf(z7);
        Object obj = R1.f8403h;
        return new R1(this, str, valueOf, 2);
    }

    public S1(String str, Uri uri, String str2, String str3, boolean z7, boolean z8, boolean z9, boolean z10, N3.f fVar) {
        this.f8418e = str;
        this.f8415a = uri;
        this.f = str2;
        this.f8419g = str3;
        this.f8416b = z7;
        this.f8417c = z8;
        this.d = z10;
        this.f8420h = fVar;
    }
}
