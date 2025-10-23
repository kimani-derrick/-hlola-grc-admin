package g;

import android.animation.TimeInterpolator;
/* renamed from: g.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0706d implements TimeInterpolator {

    /* renamed from: a  reason: collision with root package name */
    public int[] f10480a;

    /* renamed from: b  reason: collision with root package name */
    public int f10481b;

    /* renamed from: c  reason: collision with root package name */
    public int f10482c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f7;
        int i7 = (int) ((f * this.f10482c) + 0.5f);
        int i8 = this.f10481b;
        int[] iArr = this.f10480a;
        int i9 = 0;
        while (i9 < i8) {
            int i10 = iArr[i9];
            if (i7 < i10) {
                break;
            }
            i7 -= i10;
            i9++;
        }
        if (i9 < i8) {
            f7 = i7 / this.f10482c;
        } else {
            f7 = 0.0f;
        }
        return (i9 / i8) + f7;
    }
}
