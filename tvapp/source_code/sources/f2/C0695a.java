package f2;

import H2.A;
import a.AbstractC0189a;
import e2.J0;
import java.util.Arrays;
/* renamed from: f2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0695a {

    /* renamed from: a  reason: collision with root package name */
    public final long f10334a;

    /* renamed from: b  reason: collision with root package name */
    public final J0 f10335b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10336c;
    public final A d;

    /* renamed from: e  reason: collision with root package name */
    public final long f10337e;
    public final J0 f;

    /* renamed from: g  reason: collision with root package name */
    public final int f10338g;

    /* renamed from: h  reason: collision with root package name */
    public final A f10339h;

    /* renamed from: i  reason: collision with root package name */
    public final long f10340i;

    /* renamed from: j  reason: collision with root package name */
    public final long f10341j;

    public C0695a(long j7, J0 j02, int i7, A a7, long j8, J0 j03, int i8, A a8, long j9, long j10) {
        this.f10334a = j7;
        this.f10335b = j02;
        this.f10336c = i7;
        this.d = a7;
        this.f10337e = j8;
        this.f = j03;
        this.f10338g = i8;
        this.f10339h = a8;
        this.f10340i = j9;
        this.f10341j = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0695a.class != obj.getClass()) {
            return false;
        }
        C0695a c0695a = (C0695a) obj;
        if (this.f10334a == c0695a.f10334a && this.f10336c == c0695a.f10336c && this.f10337e == c0695a.f10337e && this.f10338g == c0695a.f10338g && this.f10340i == c0695a.f10340i && this.f10341j == c0695a.f10341j && AbstractC0189a.r(this.f10335b, c0695a.f10335b) && AbstractC0189a.r(this.d, c0695a.d) && AbstractC0189a.r(this.f, c0695a.f) && AbstractC0189a.r(this.f10339h, c0695a.f10339h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f10334a), this.f10335b, Integer.valueOf(this.f10336c), this.d, Long.valueOf(this.f10337e), this.f, Integer.valueOf(this.f10338g), this.f10339h, Long.valueOf(this.f10340i), Long.valueOf(this.f10341j)});
    }
}
