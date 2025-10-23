package j0;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.leanback.app.C0272a;
import androidx.leanback.widget.VerticalGridView;
import com.boxhdo.android.tv.R;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* renamed from: j0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0781c extends FrameLayout {

    /* renamed from: A  reason: collision with root package name */
    public int f11517A;

    /* renamed from: B  reason: collision with root package name */
    public final ArrayList f11518B;

    /* renamed from: C  reason: collision with root package name */
    public final int f11519C;

    /* renamed from: D  reason: collision with root package name */
    public int f11520D;

    /* renamed from: E  reason: collision with root package name */
    public final C0272a f11521E;

    /* renamed from: q  reason: collision with root package name */
    public final ViewGroup f11522q;

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f11523r;

    /* renamed from: s  reason: collision with root package name */
    public ArrayList f11524s;

    /* renamed from: t  reason: collision with root package name */
    public final float f11525t;

    /* renamed from: u  reason: collision with root package name */
    public final float f11526u;

    /* renamed from: v  reason: collision with root package name */
    public final float f11527v;

    /* renamed from: w  reason: collision with root package name */
    public final int f11528w;

    /* renamed from: x  reason: collision with root package name */
    public final DecelerateInterpolator f11529x;

    /* renamed from: y  reason: collision with root package name */
    public float f11530y;

    /* renamed from: z  reason: collision with root package name */
    public float f11531z;

    public AbstractC0781c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f11523r = new ArrayList();
        this.f11530y = 3.0f;
        this.f11531z = 1.0f;
        this.f11517A = 0;
        this.f11518B = new ArrayList();
        this.f11519C = R.layout.lb_picker_item;
        this.f11520D = 0;
        this.f11521E = new C0272a(1, this);
        setEnabled(true);
        setDescendantFocusability(262144);
        this.f11526u = 1.0f;
        this.f11525t = 1.0f;
        this.f11527v = 0.5f;
        this.f11528w = 200;
        this.f11529x = new DecelerateInterpolator(2.5f);
        new AccelerateInterpolator(2.5f);
        this.f11522q = (ViewGroup) ((ViewGroup) LayoutInflater.from(getContext()).inflate(R.layout.lb_picker, (ViewGroup) this, true)).findViewById(R.id.picker);
    }

    public final void a(int i7, C0782d c0782d) {
        this.f11524s.set(i7, c0782d);
        VerticalGridView verticalGridView = (VerticalGridView) this.f11523r.get(i7);
        C0779a c0779a = (C0779a) verticalGridView.getAdapter();
        if (c0779a != null) {
            c0779a.f15466a.b();
        }
        verticalGridView.setSelectedPosition(c0782d.f11532a - c0782d.f11533b);
    }

    public final void b(View view, boolean z7, float f, DecelerateInterpolator decelerateInterpolator) {
        view.animate().cancel();
        if (!z7) {
            view.setAlpha(f);
        } else {
            view.animate().alpha(f).setDuration(this.f11528w).setInterpolator(decelerateInterpolator).start();
        }
    }

    public final void c(View view, boolean z7, int i7, boolean z8) {
        boolean z9;
        float f;
        if (i7 != this.f11517A && hasFocus()) {
            z9 = false;
        } else {
            z9 = true;
        }
        DecelerateInterpolator decelerateInterpolator = this.f11529x;
        if (z7) {
            if (z9) {
                f = this.f11526u;
            } else {
                f = this.f11525t;
            }
        } else if (z9) {
            f = this.f11527v;
        } else {
            f = 0.0f;
        }
        b(view, z8, f, decelerateInterpolator);
    }

    public final void d(int i7) {
        boolean z7;
        VerticalGridView verticalGridView = (VerticalGridView) this.f11523r.get(i7);
        int selectedPosition = verticalGridView.getSelectedPosition();
        for (int i8 = 0; i8 < verticalGridView.getAdapter().a(); i8++) {
            View t5 = verticalGridView.getLayoutManager().t(i8);
            if (t5 != null) {
                if (selectedPosition == i8) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                c(t5, z7, i7, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (isActivated()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 23 && keyCode != 66) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 1) {
                performClick();
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        for (int i7 = 0; i7 < getColumnsCount(); i7++) {
            f((VerticalGridView) this.f11523r.get(i7));
        }
    }

    public final void f(VerticalGridView verticalGridView) {
        float visibleItemCount;
        ViewGroup.LayoutParams layoutParams = verticalGridView.getLayoutParams();
        if (isActivated()) {
            visibleItemCount = getActivatedVisibleItemCount();
        } else {
            visibleItemCount = getVisibleItemCount();
        }
        layoutParams.height = (int) AbstractC0515y1.g(visibleItemCount, 1.0f, verticalGridView.getVerticalSpacing(), getPickerItemHeightPixels() * visibleItemCount);
        verticalGridView.setLayoutParams(layoutParams);
    }

    public float getActivatedVisibleItemCount() {
        return this.f11530y;
    }

    public int getColumnsCount() {
        ArrayList arrayList = this.f11524s;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public int getPickerItemHeightPixels() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.picker_item_height);
    }

    public final int getPickerItemLayoutId() {
        return this.f11519C;
    }

    public final int getPickerItemTextViewId() {
        return this.f11520D;
    }

    public int getSelectedColumn() {
        return this.f11517A;
    }

    public final CharSequence getSeparator() {
        return (CharSequence) this.f11518B.get(0);
    }

    public final List<CharSequence> getSeparators() {
        return this.f11518B;
    }

    public float getVisibleItemCount() {
        return 1.0f;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i7, Rect rect) {
        int selectedColumn = getSelectedColumn();
        ArrayList arrayList = this.f11523r;
        if (selectedColumn < arrayList.size()) {
            return ((VerticalGridView) arrayList.get(selectedColumn)).requestFocus(i7, rect);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f11523r;
            if (i7 < arrayList.size()) {
                if (((VerticalGridView) arrayList.get(i7)).hasFocus()) {
                    setSelectedColumn(i7);
                }
                i7++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public void setActivated(boolean z7) {
        ArrayList arrayList;
        boolean isActivated = isActivated();
        super.setActivated(z7);
        if (z7 == isActivated) {
            return;
        }
        boolean hasFocus = hasFocus();
        int selectedColumn = getSelectedColumn();
        setDescendantFocusability(131072);
        if (!z7 && hasFocus && isFocusable()) {
            requestFocus();
        }
        int i7 = 0;
        while (true) {
            int columnsCount = getColumnsCount();
            arrayList = this.f11523r;
            if (i7 >= columnsCount) {
                break;
            }
            ((VerticalGridView) arrayList.get(i7)).setFocusable(z7);
            i7++;
        }
        e();
        boolean isActivated2 = isActivated();
        for (int i8 = 0; i8 < getColumnsCount(); i8++) {
            VerticalGridView verticalGridView = (VerticalGridView) arrayList.get(i8);
            for (int i9 = 0; i9 < verticalGridView.getChildCount(); i9++) {
                verticalGridView.getChildAt(i9).setFocusable(isActivated2);
            }
        }
        if (z7 && hasFocus && selectedColumn >= 0) {
            ((VerticalGridView) arrayList.get(selectedColumn)).requestFocus();
        }
        setDescendantFocusability(262144);
    }

    public void setActivatedVisibleItemCount(float f) {
        if (f > 0.0f) {
            if (this.f11530y != f) {
                this.f11530y = f;
                if (isActivated()) {
                    e();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setColumns(List<C0782d> list) {
        ArrayList arrayList = this.f11518B;
        if (arrayList.size() != 0) {
            if (arrayList.size() == 1) {
                CharSequence charSequence = (CharSequence) arrayList.get(0);
                arrayList.clear();
                arrayList.add("");
                for (int i7 = 0; i7 < list.size() - 1; i7++) {
                    arrayList.add(charSequence);
                }
                arrayList.add("");
            } else if (arrayList.size() != list.size() + 1) {
                throw new IllegalStateException("Separators size: " + arrayList.size() + " mustequal the size of columns: " + list.size() + " + 1");
            }
            ArrayList arrayList2 = this.f11523r;
            arrayList2.clear();
            ViewGroup viewGroup = this.f11522q;
            viewGroup.removeAllViews();
            ArrayList arrayList3 = new ArrayList(list);
            this.f11524s = arrayList3;
            if (this.f11517A > arrayList3.size() - 1) {
                this.f11517A = this.f11524s.size() - 1;
            }
            LayoutInflater from = LayoutInflater.from(getContext());
            int columnsCount = getColumnsCount();
            if (!TextUtils.isEmpty((CharSequence) arrayList.get(0))) {
                TextView textView = (TextView) from.inflate(R.layout.lb_picker_separator, viewGroup, false);
                textView.setText((CharSequence) arrayList.get(0));
                viewGroup.addView(textView);
            }
            int i8 = 0;
            while (i8 < columnsCount) {
                VerticalGridView verticalGridView = (VerticalGridView) from.inflate(R.layout.lb_picker_column, viewGroup, false);
                f(verticalGridView);
                verticalGridView.setWindowAlignment(0);
                verticalGridView.setHasFixedSize(false);
                verticalGridView.setFocusable(isActivated());
                verticalGridView.setItemViewCacheSize(0);
                arrayList2.add(verticalGridView);
                viewGroup.addView(verticalGridView);
                int i9 = i8 + 1;
                if (!TextUtils.isEmpty((CharSequence) arrayList.get(i9))) {
                    TextView textView2 = (TextView) from.inflate(R.layout.lb_picker_separator, viewGroup, false);
                    textView2.setText((CharSequence) arrayList.get(i9));
                    viewGroup.addView(textView2);
                }
                getContext();
                verticalGridView.setAdapter(new C0779a(this, getPickerItemLayoutId(), getPickerItemTextViewId(), i8));
                verticalGridView.setOnChildViewHolderSelectedListener(this.f11521E);
                i8 = i9;
            }
            return;
        }
        throw new IllegalStateException("Separators size is: " + arrayList.size() + ". At least one separator must be provided");
    }

    public final void setPickerItemTextViewId(int i7) {
        this.f11520D = i7;
    }

    public void setSelectedColumn(int i7) {
        if (this.f11517A != i7) {
            this.f11517A = i7;
            for (int i8 = 0; i8 < this.f11523r.size(); i8++) {
                d(i8);
            }
        }
    }

    public final void setSeparator(CharSequence charSequence) {
        setSeparators(Arrays.asList(charSequence));
    }

    public final void setSeparators(List<CharSequence> list) {
        ArrayList arrayList = this.f11518B;
        arrayList.clear();
        arrayList.addAll(list);
    }

    public void setVisibleItemCount(float f) {
        if (f > 0.0f) {
            if (this.f11531z != f) {
                this.f11531z = f;
                if (!isActivated()) {
                    e();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }
}
