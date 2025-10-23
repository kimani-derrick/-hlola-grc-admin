package c4;

import S3.f;
import java.util.Objects;
/* renamed from: c4.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0393b {

    /* renamed from: a  reason: collision with root package name */
    public final f f7271a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7272b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7273c;
    public final String d;

    public C0393b(f fVar, int i7, String str, String str2) {
        this.f7271a = fVar;
        this.f7272b = i7;
        this.f7273c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0393b)) {
            return false;
        }
        C0393b c0393b = (C0393b) obj;
        if (this.f7271a != c0393b.f7271a || this.f7272b != c0393b.f7272b || !this.f7273c.equals(c0393b.f7273c) || !this.d.equals(c0393b.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f7271a, Integer.valueOf(this.f7272b), this.f7273c, this.d);
    }

    public final String toString() {
        return "(status=" + this.f7271a + ", keyId=" + this.f7272b + ", keyType='" + this.f7273c + "', keyPrefix='" + this.d + "')";
    }
}
