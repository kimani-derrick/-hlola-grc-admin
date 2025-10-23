package a5;

import M5.g;
/* renamed from: a5.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0219e {

    /* renamed from: a  reason: collision with root package name */
    public final String f5194a;

    public C0219e(String str) {
        g.f(str, "sessionId");
        this.f5194a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0219e) && g.a(this.f5194a, ((C0219e) obj).f5194a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5194a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f5194a + ')';
    }
}
