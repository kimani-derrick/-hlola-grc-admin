package s3;

import android.os.Bundle;
/* renamed from: s3.M  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1158M {

    /* renamed from: a  reason: collision with root package name */
    public String f13827a;

    /* renamed from: b  reason: collision with root package name */
    public String f13828b;

    /* renamed from: c  reason: collision with root package name */
    public long f13829c;
    public Bundle d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, s3.M] */
    public static C1158M b(C1201u c1201u) {
        String str = c1201u.f14244q;
        Bundle h7 = c1201u.f14245r.h();
        ?? obj = new Object();
        obj.f13827a = str;
        obj.f13828b = c1201u.f14246s;
        obj.d = h7;
        obj.f13829c = c1201u.f14247t;
        return obj;
    }

    public final C1201u a() {
        return new C1201u(this.f13827a, new r(new Bundle(this.d)), this.f13828b, this.f13829c);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.d);
        return "origin=" + this.f13828b + ",name=" + this.f13827a + ",params=" + valueOf;
    }
}
