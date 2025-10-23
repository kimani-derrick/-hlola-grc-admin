package Q;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import k.View$OnClickListenerC0855G0;
/* loaded from: classes.dex */
public abstract class c extends BaseAdapter implements Filterable, d {

    /* renamed from: q  reason: collision with root package name */
    public boolean f2821q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2822r;

    /* renamed from: s  reason: collision with root package name */
    public Cursor f2823s;

    /* renamed from: t  reason: collision with root package name */
    public int f2824t;

    /* renamed from: u  reason: collision with root package name */
    public a f2825u;

    /* renamed from: v  reason: collision with root package name */
    public b f2826v;

    /* renamed from: w  reason: collision with root package name */
    public e f2827w;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f2823s;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f2825u;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.f2826v;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f2823s = cursor;
            if (cursor != null) {
                a aVar2 = this.f2825u;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.f2826v;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f2824t = cursor.getColumnIndexOrThrow("_id");
                this.f2821q = true;
                notifyDataSetChanged();
            } else {
                this.f2824t = -1;
                this.f2821q = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (this.f2821q && (cursor = this.f2823s) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i7, View view, ViewGroup viewGroup) {
        if (this.f2821q) {
            this.f2823s.moveToPosition(i7);
            if (view == null) {
                View$OnClickListenerC0855G0 view$OnClickListenerC0855G0 = (View$OnClickListenerC0855G0) this;
                view = view$OnClickListenerC0855G0.f11895z.inflate(view$OnClickListenerC0855G0.f11894y, viewGroup, false);
            }
            a(view, this.f2823s);
            return view;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.Filter, Q.e] */
    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f2827w == null) {
            ?? filter = new Filter();
            filter.f2828a = this;
            this.f2827w = filter;
        }
        return this.f2827w;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i7) {
        Cursor cursor;
        if (this.f2821q && (cursor = this.f2823s) != null) {
            cursor.moveToPosition(i7);
            return this.f2823s;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        Cursor cursor;
        if (!this.f2821q || (cursor = this.f2823s) == null || !cursor.moveToPosition(i7)) {
            return 0L;
        }
        return this.f2823s.getLong(this.f2824t);
    }

    @Override // android.widget.Adapter
    public View getView(int i7, View view, ViewGroup viewGroup) {
        if (this.f2821q) {
            if (this.f2823s.moveToPosition(i7)) {
                if (view == null) {
                    view = d(viewGroup);
                }
                a(view, this.f2823s);
                return view;
            }
            throw new IllegalStateException(AbstractC0515y1.l("couldn't move cursor to position ", i7));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
