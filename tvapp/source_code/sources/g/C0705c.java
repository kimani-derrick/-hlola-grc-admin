package g;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import h.AbstractC0738a;
import p6.l;
/* renamed from: g.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0705c extends l {

    /* renamed from: r  reason: collision with root package name */
    public final ObjectAnimator f10478r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f10479s;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.animation.TimeInterpolator, java.lang.Object, g.d] */
    public C0705c(AnimationDrawable animationDrawable, boolean z7, boolean z8) {
        int i7;
        int i8;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i9 = z7 ? numberOfFrames - 1 : 0;
        if (z7) {
            i7 = 0;
        } else {
            i7 = numberOfFrames - 1;
        }
        ?? obj = new Object();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        obj.f10481b = numberOfFrames2;
        int[] iArr = obj.f10480a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            obj.f10480a = new int[numberOfFrames2];
        }
        int[] iArr2 = obj.f10480a;
        int i10 = 0;
        for (int i11 = 0; i11 < numberOfFrames2; i11++) {
            if (z7) {
                i8 = (numberOfFrames2 - i11) - 1;
            } else {
                i8 = i11;
            }
            int duration = animationDrawable.getDuration(i8);
            iArr2[i11] = duration;
            i10 += duration;
        }
        obj.f10482c = i10;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i9, i7);
        AbstractC0738a.a(ofInt, true);
        ofInt.setDuration(obj.f10482c);
        ofInt.setInterpolator(obj);
        this.f10479s = z8;
        this.f10478r = ofInt;
    }

    @Override // p6.l
    public final void F() {
        this.f10478r.reverse();
    }

    @Override // p6.l
    public final void O() {
        this.f10478r.start();
    }

    @Override // p6.l
    public final void P() {
        this.f10478r.cancel();
    }

    @Override // p6.l
    public final boolean g() {
        return this.f10479s;
    }
}
