package a5;

import M5.g;
import u4.C1287k;
/* renamed from: a5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0215a {

    /* renamed from: a  reason: collision with root package name */
    public final e6.a f5178a;

    /* renamed from: b  reason: collision with root package name */
    public C1287k f5179b = null;

    public C0215a(e6.d dVar) {
        this.f5178a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0215a)) {
            return false;
        }
        C0215a c0215a = (C0215a) obj;
        if (g.a(this.f5178a, c0215a.f5178a) && g.a(this.f5179b, c0215a.f5179b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f5178a.hashCode() * 31;
        C1287k c1287k = this.f5179b;
        if (c1287k == null) {
            hashCode = 0;
        } else {
            hashCode = c1287k.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f5178a + ", subscriber=" + this.f5179b + ')';
    }
}
