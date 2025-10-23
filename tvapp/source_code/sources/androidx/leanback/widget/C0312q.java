package androidx.leanback.widget;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.boxhdo.android.tv.R;
/* renamed from: androidx.leanback.widget.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0312q implements InterfaceC0304m {

    /* renamed from: a  reason: collision with root package name */
    public boolean f6638a;

    /* renamed from: b  reason: collision with root package name */
    public float f6639b;

    /* renamed from: c  reason: collision with root package name */
    public int f6640c;
    public boolean d;

    @Override // androidx.leanback.widget.InterfaceC0304m
    public final void a(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.leanback.widget.p, androidx.leanback.widget.o, java.lang.Object] */
    @Override // androidx.leanback.widget.InterfaceC0304m
    public final void b(View view, boolean z7) {
        float f;
        if (!this.f6638a) {
            Resources resources = view.getResources();
            TypedValue typedValue = new TypedValue();
            if (this.d) {
                resources.getValue(R.dimen.lb_browse_header_select_scale, typedValue, true);
                f = typedValue.getFloat();
            } else {
                f = 1.0f;
            }
            this.f6639b = f;
            resources.getValue(R.dimen.lb_browse_header_select_duration, typedValue, true);
            this.f6640c = typedValue.data;
            this.f6638a = true;
        }
        view.setSelected(z7);
        C0308o c0308o = (C0308o) view.getTag(R.id.lb_focus_animator);
        C0308o c0308o2 = c0308o;
        if (c0308o == null) {
            ?? c0308o3 = new C0308o(view, this.f6639b, false, this.f6640c);
            ViewParent parent = view.getParent();
            while (parent != null && !(parent instanceof RecyclerView)) {
                parent = parent.getParent();
            }
            if (parent != null) {
                c0308o3.f6624k = (G) ((RecyclerView) parent).M(view);
            }
            view.setTag(R.id.lb_focus_animator, c0308o3);
            c0308o2 = c0308o3;
        }
        c0308o2.a(z7, false);
    }
}
