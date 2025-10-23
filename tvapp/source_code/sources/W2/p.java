package W2;

import H2.m0;
import Z2.AbstractC0156a;
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final m0 f3871a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f3872b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3873c;

    public p(int i7, m0 m0Var, int[] iArr) {
        if (iArr.length == 0) {
            AbstractC0156a.r("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f3871a = m0Var;
        this.f3872b = iArr;
        this.f3873c = i7;
    }
}
