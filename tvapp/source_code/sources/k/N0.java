package k;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import i.InterfaceC0762a;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class N0 implements j.p {

    /* renamed from: q  reason: collision with root package name */
    public j.j f11912q;

    /* renamed from: r  reason: collision with root package name */
    public j.k f11913r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Toolbar f11914s;

    public N0(Toolbar toolbar) {
        this.f11914s = toolbar;
    }

    @Override // j.p
    public final void a(Context context, j.j jVar) {
        j.k kVar;
        j.j jVar2 = this.f11912q;
        if (jVar2 != null && (kVar = this.f11913r) != null) {
            jVar2.d(kVar);
        }
        this.f11912q = jVar;
    }

    @Override // j.p
    public final boolean d() {
        return false;
    }

    @Override // j.p
    public final boolean e(j.k kVar) {
        Toolbar toolbar = this.f11914s;
        toolbar.c();
        ViewParent parent = toolbar.f5559x.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f5559x);
            }
            toolbar.addView(toolbar.f5559x);
        }
        View view = kVar.f11489z;
        if (view == null) {
            view = null;
        }
        toolbar.f5560y = view;
        this.f11913r = kVar;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f5560y);
            }
            O0 g7 = Toolbar.g();
            g7.f11915a = (toolbar.f5525D & 112) | 8388611;
            g7.f11916b = 2;
            toolbar.f5560y.setLayoutParams(g7);
            toolbar.addView(toolbar.f5560y);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((O0) childAt.getLayoutParams()).f11916b != 2 && childAt != toolbar.f5552q) {
                toolbar.removeViewAt(childCount);
                toolbar.f5541U.add(childAt);
            }
        }
        toolbar.requestLayout();
        kVar.f11466B = true;
        kVar.n.o(false);
        View view2 = toolbar.f5560y;
        if (view2 instanceof InterfaceC0762a) {
            SearchView searchView = (SearchView) ((InterfaceC0762a) view2);
            if (!searchView.f5511p0) {
                searchView.f5511p0 = true;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.F;
                int imeOptions = searchAutoComplete.getImeOptions();
                searchView.f5512q0 = imeOptions;
                searchAutoComplete.setImeOptions(imeOptions | 33554432);
                searchAutoComplete.setText("");
                searchView.setIconified(false);
            }
        }
        toolbar.t();
        return true;
    }

    @Override // j.p
    public final void f() {
        if (this.f11913r != null) {
            j.j jVar = this.f11912q;
            if (jVar != null) {
                int size = jVar.f.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (this.f11912q.getItem(i7) == this.f11913r) {
                        return;
                    }
                }
            }
            g(this.f11913r);
        }
    }

    @Override // j.p
    public final boolean g(j.k kVar) {
        Toolbar toolbar = this.f11914s;
        View view = toolbar.f5560y;
        if (view instanceof InterfaceC0762a) {
            SearchView searchView = (SearchView) ((InterfaceC0762a) view);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.F;
            searchAutoComplete.setText("");
            searchAutoComplete.setSelection(searchAutoComplete.length());
            searchView.f5510o0 = "";
            searchView.clearFocus();
            searchView.v(true);
            searchAutoComplete.setImeOptions(searchView.f5512q0);
            searchView.f5511p0 = false;
        }
        toolbar.removeView(toolbar.f5560y);
        toolbar.removeView(toolbar.f5559x);
        toolbar.f5560y = null;
        ArrayList arrayList = toolbar.f5541U;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f11913r = null;
        toolbar.requestLayout();
        kVar.f11466B = false;
        kVar.n.o(false);
        toolbar.t();
        return true;
    }

    @Override // j.p
    public final boolean k(j.t tVar) {
        return false;
    }

    @Override // j.p
    public final void b(j.j jVar, boolean z7) {
    }
}
