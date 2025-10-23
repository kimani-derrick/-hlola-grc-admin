package j;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class g extends BaseAdapter {

    /* renamed from: q  reason: collision with root package name */
    public final j f11441q;

    /* renamed from: r  reason: collision with root package name */
    public int f11442r = -1;

    /* renamed from: s  reason: collision with root package name */
    public boolean f11443s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f11444t;

    /* renamed from: u  reason: collision with root package name */
    public final LayoutInflater f11445u;

    /* renamed from: v  reason: collision with root package name */
    public final int f11446v;

    public g(j jVar, LayoutInflater layoutInflater, boolean z7, int i7) {
        this.f11444t = z7;
        this.f11445u = layoutInflater;
        this.f11441q = jVar;
        this.f11446v = i7;
        a();
    }

    public final void a() {
        j jVar = this.f11441q;
        k kVar = jVar.f11463s;
        if (kVar != null) {
            jVar.i();
            ArrayList arrayList = jVar.f11455j;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((k) arrayList.get(i7)) == kVar) {
                    this.f11442r = i7;
                    return;
                }
            }
        }
        this.f11442r = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public final k getItem(int i7) {
        ArrayList k5;
        boolean z7 = this.f11444t;
        j jVar = this.f11441q;
        if (z7) {
            jVar.i();
            k5 = jVar.f11455j;
        } else {
            k5 = jVar.k();
        }
        int i8 = this.f11442r;
        if (i8 >= 0 && i7 >= i8) {
            i7++;
        }
        return (k) k5.get(i7);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList k5;
        boolean z7 = this.f11444t;
        j jVar = this.f11441q;
        if (z7) {
            jVar.i();
            k5 = jVar.f11455j;
        } else {
            k5 = jVar.k();
        }
        int i7 = this.f11442r;
        int size = k5.size();
        if (i7 < 0) {
            return size;
        }
        return size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        int i8;
        boolean z7 = false;
        if (view == null) {
            view = this.f11445u.inflate(this.f11446v, viewGroup, false);
        }
        int i9 = getItem(i7).f11468b;
        int i10 = i7 - 1;
        if (i10 >= 0) {
            i8 = getItem(i10).f11468b;
        } else {
            i8 = i9;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f11441q.l() && i9 != i8) {
            z7 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z7);
        q qVar = (q) view;
        if (this.f11443s) {
            listMenuItemView.setForceShowIcon(true);
        }
        qVar.c(getItem(i7));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
