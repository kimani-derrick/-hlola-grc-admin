package n0;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import com.boxhdo.android.tv.R;
import java.lang.ref.WeakReference;
/* renamed from: n0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1012c extends M5.h implements L5.l {

    /* renamed from: s  reason: collision with root package name */
    public static final C1012c f12522s = new C1012c(1, 0);

    /* renamed from: t  reason: collision with root package name */
    public static final C1012c f12523t = new C1012c(1, 1);

    /* renamed from: u  reason: collision with root package name */
    public static final C1012c f12524u = new C1012c(1, 2);

    /* renamed from: v  reason: collision with root package name */
    public static final C1012c f12525v = new C1012c(1, 3);

    /* renamed from: w  reason: collision with root package name */
    public static final C1012c f12526w = new C1012c(1, 4);

    /* renamed from: x  reason: collision with root package name */
    public static final C1012c f12527x = new C1012c(1, 5);

    /* renamed from: y  reason: collision with root package name */
    public static final C1012c f12528y = new C1012c(1, 6);

    /* renamed from: z  reason: collision with root package name */
    public static final C1012c f12529z = new C1012c(1, 7);

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f12530r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1012c(int i7, int i8) {
        super(i7);
        this.f12530r = i8;
    }

    @Override // L5.l
    public final Object c(Object obj) {
        switch (this.f12530r) {
            case 0:
                Context context = (Context) obj;
                M5.g.f(context, "it");
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 1:
                Context context2 = (Context) obj;
                M5.g.f(context2, "it");
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 2:
                v vVar = (v) obj;
                M5.g.f(vVar, "destination");
                y yVar = vVar.f12601r;
                if (yVar == null || yVar.f12614B != vVar.f12607x) {
                    return null;
                }
                return yVar;
            case 3:
                v vVar2 = (v) obj;
                M5.g.f(vVar2, "destination");
                y yVar2 = vVar2.f12601r;
                if (yVar2 == null || yVar2.f12614B != vVar2.f12607x) {
                    return null;
                }
                return yVar2;
            case 4:
                v vVar3 = (v) obj;
                M5.g.f(vVar3, "it");
                return vVar3.f12601r;
            case 5:
                v vVar4 = (v) obj;
                M5.g.f(vVar4, "it");
                if (vVar4 instanceof y) {
                    y yVar3 = (y) vVar4;
                    return yVar3.n(yVar3.f12614B, true);
                }
                return null;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                View view = (View) obj;
                M5.g.f(view, "it");
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View view2 = (View) obj;
                M5.g.f(view2, "it");
                Object tag = view2.getTag(R.id.nav_controller_view_tag);
                if (tag instanceof WeakReference) {
                    tag = ((WeakReference) tag).get();
                } else if (!(tag instanceof C0999A)) {
                    return null;
                }
                return (C0999A) tag;
        }
    }
}
