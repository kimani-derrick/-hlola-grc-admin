package z3;

import K.O;
import T.e;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.reflect.Field;
/* renamed from: z3.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1516c implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final View f16450q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f16451r;

    /* renamed from: s  reason: collision with root package name */
    public int f16452s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f16453t;

    public RunnableC1516c(BottomSheetBehavior bottomSheetBehavior, View view, int i7) {
        this.f16453t = bottomSheetBehavior;
        this.f16450q = view;
        this.f16452s = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BottomSheetBehavior bottomSheetBehavior = this.f16453t;
        e eVar = bottomSheetBehavior.f8751G;
        if (eVar != null && eVar.f()) {
            Field field = O.f1447a;
            this.f16450q.postOnAnimation(this);
        } else {
            bottomSheetBehavior.z(this.f16452s);
        }
        this.f16451r = false;
    }
}
