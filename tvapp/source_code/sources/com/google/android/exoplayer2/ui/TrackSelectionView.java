package com.google.android.exoplayer2.ui;

import H2.m0;
import L3.e;
import T4.c;
import W2.u;
import X2.I;
import X2.J;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.boxhdo.android.tv.R;
import e2.K0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
@Deprecated
/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: A  reason: collision with root package name */
    public CheckedTextView[][] f8207A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f8208B;

    /* renamed from: q  reason: collision with root package name */
    public final int f8209q;

    /* renamed from: r  reason: collision with root package name */
    public final LayoutInflater f8210r;

    /* renamed from: s  reason: collision with root package name */
    public final CheckedTextView f8211s;

    /* renamed from: t  reason: collision with root package name */
    public final CheckedTextView f8212t;

    /* renamed from: u  reason: collision with root package name */
    public final e f8213u;

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList f8214v;

    /* renamed from: w  reason: collision with root package name */
    public final HashMap f8215w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f8216x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f8217y;

    /* renamed from: z  reason: collision with root package name */
    public I f8218z;

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.f8209q = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.f8210r = from;
        e eVar = new e(3, this);
        this.f8213u = eVar;
        this.f8218z = new c(getResources());
        this.f8214v = new ArrayList();
        this.f8215w = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(17367055, (ViewGroup) this, false);
        this.f8211s = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(eVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(17367055, (ViewGroup) this, false);
        this.f8212t = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(eVar);
        addView(checkedTextView2);
    }

    public final void a() {
        boolean z7;
        this.f8211s.setChecked(this.f8208B);
        boolean z8 = this.f8208B;
        HashMap hashMap = this.f8215w;
        if (!z8 && hashMap.size() == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f8212t.setChecked(z7);
        for (int i7 = 0; i7 < this.f8207A.length; i7++) {
            u uVar = (u) hashMap.get(((K0) this.f8214v.get(i7)).f9691r);
            int i8 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f8207A[i7];
                if (i8 < checkedTextViewArr.length) {
                    if (uVar != null) {
                        Object tag = checkedTextViewArr[i8].getTag();
                        tag.getClass();
                        this.f8207A[i7][i8].setChecked(uVar.f3883r.contains(Integer.valueOf(((J) tag).f4147b)));
                    } else {
                        checkedTextViewArr[i8].setChecked(false);
                    }
                    i8++;
                }
            }
        }
    }

    public final void b() {
        boolean z7;
        boolean z8;
        int i7;
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f8214v;
        boolean isEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.f8212t;
        CheckedTextView checkedTextView2 = this.f8211s;
        if (isEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.f8207A = new CheckedTextView[arrayList.size()];
        if (this.f8217y && arrayList.size() > 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            K0 k02 = (K0) arrayList.get(i8);
            if (this.f8216x && k02.f9692s) {
                z8 = true;
            } else {
                z8 = false;
            }
            CheckedTextView[][] checkedTextViewArr = this.f8207A;
            int i9 = k02.f9690q;
            checkedTextViewArr[i8] = new CheckedTextView[i9];
            J[] jArr = new J[i9];
            for (int i10 = 0; i10 < k02.f9690q; i10++) {
                jArr[i10] = new J(k02, i10);
            }
            for (int i11 = 0; i11 < i9; i11++) {
                LayoutInflater layoutInflater = this.f8210r;
                if (i11 == 0) {
                    addView(layoutInflater.inflate(R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                if (!z8 && !z7) {
                    i7 = 17367055;
                } else {
                    i7 = 17367056;
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate(i7, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.f8209q);
                I i12 = this.f8218z;
                J j7 = jArr[i11];
                checkedTextView3.setText(((c) i12).N(j7.f4146a.f9691r.f1136t[j7.f4147b]));
                checkedTextView3.setTag(jArr[i11]);
                if (k02.d(i11)) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.f8213u);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.f8207A[i8][i11] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        a();
    }

    public boolean getIsDisabled() {
        return this.f8208B;
    }

    public Map<m0, u> getOverrides() {
        return this.f8215w;
    }

    public void setAllowAdaptiveSelections(boolean z7) {
        if (this.f8216x != z7) {
            this.f8216x = z7;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z7) {
        if (this.f8217y != z7) {
            this.f8217y = z7;
            if (!z7) {
                HashMap hashMap = this.f8215w;
                if (hashMap.size() > 1) {
                    ArrayList arrayList = this.f8214v;
                    HashMap hashMap2 = new HashMap();
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        u uVar = (u) hashMap.get(((K0) arrayList.get(i7)).f9691r);
                        if (uVar != null && hashMap2.isEmpty()) {
                            hashMap2.put(uVar.f3882q, uVar);
                        }
                    }
                    hashMap.clear();
                    hashMap.putAll(hashMap2);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z7) {
        this.f8211s.setVisibility(z7 ? 0 : 8);
    }

    public void setTrackNameProvider(I i7) {
        i7.getClass();
        this.f8218z = i7;
        b();
    }
}
