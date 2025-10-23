package androidx.appcompat.widget;

import F5.f;
import K.O;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import androidx.leanback.widget.C0307n0;
import com.boxhdo.android.tv.R;
import e.AbstractC0565a;
import i.InterfaceC0762a;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.AbstractC0883d0;
import k.AbstractC0898l;
import k.C0849D0;
import k.C0851E0;
import k.C0885e0;
import k.InterfaceC0843A0;
import k.InterfaceC0845B0;
import k.InterfaceC0847C0;
import k.RunnableC0923x0;
import k.View$OnClickListenerC0855G0;
import k.View$OnLayoutChangeListenerC0925y0;
import k.z0;
/* loaded from: classes.dex */
public class SearchView extends AbstractC0883d0 implements InterfaceC0762a {

    /* renamed from: w0  reason: collision with root package name */
    public static final f f5479w0;
    public final SearchAutoComplete F;

    /* renamed from: G  reason: collision with root package name */
    public final View f5480G;

    /* renamed from: H  reason: collision with root package name */
    public final View f5481H;

    /* renamed from: I  reason: collision with root package name */
    public final View f5482I;

    /* renamed from: J  reason: collision with root package name */
    public final ImageView f5483J;

    /* renamed from: K  reason: collision with root package name */
    public final ImageView f5484K;

    /* renamed from: L  reason: collision with root package name */
    public final ImageView f5485L;

    /* renamed from: M  reason: collision with root package name */
    public final ImageView f5486M;

    /* renamed from: N  reason: collision with root package name */
    public final View f5487N;

    /* renamed from: O  reason: collision with root package name */
    public C0851E0 f5488O;

    /* renamed from: P  reason: collision with root package name */
    public final Rect f5489P;

    /* renamed from: Q  reason: collision with root package name */
    public final Rect f5490Q;

    /* renamed from: R  reason: collision with root package name */
    public final int[] f5491R;

    /* renamed from: S  reason: collision with root package name */
    public final int[] f5492S;

    /* renamed from: T  reason: collision with root package name */
    public final ImageView f5493T;

    /* renamed from: U  reason: collision with root package name */
    public final Drawable f5494U;

    /* renamed from: V  reason: collision with root package name */
    public final int f5495V;
    public final int W;

    /* renamed from: a0  reason: collision with root package name */
    public final Intent f5496a0;

    /* renamed from: b0  reason: collision with root package name */
    public final Intent f5497b0;

    /* renamed from: c0  reason: collision with root package name */
    public final CharSequence f5498c0;

    /* renamed from: d0  reason: collision with root package name */
    public View.OnFocusChangeListener f5499d0;

    /* renamed from: e0  reason: collision with root package name */
    public View.OnClickListener f5500e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f5501f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f5502g0;

    /* renamed from: h0  reason: collision with root package name */
    public Q.c f5503h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f5504i0;

    /* renamed from: j0  reason: collision with root package name */
    public CharSequence f5505j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f5506k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f5507l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f5508m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f5509n0;

    /* renamed from: o0  reason: collision with root package name */
    public CharSequence f5510o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f5511p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f5512q0;

    /* renamed from: r0  reason: collision with root package name */
    public SearchableInfo f5513r0;

    /* renamed from: s0  reason: collision with root package name */
    public Bundle f5514s0;

    /* renamed from: t0  reason: collision with root package name */
    public final RunnableC0923x0 f5515t0;

    /* renamed from: u0  reason: collision with root package name */
    public final RunnableC0923x0 f5516u0;

    /* renamed from: v0  reason: collision with root package name */
    public final WeakHashMap f5517v0;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends AbstractC0898l {

        /* renamed from: u  reason: collision with root package name */
        public int f5518u;

        /* renamed from: v  reason: collision with root package name */
        public SearchView f5519v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f5520w;

        /* renamed from: x  reason: collision with root package name */
        public final d f5521x;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5521x = new d(this);
            this.f5518u = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i7 = configuration.screenWidthDp;
            int i8 = configuration.screenHeightDp;
            if (i7 < 960 || i8 < 720 || configuration.orientation != 2) {
                if (i7 < 600) {
                    return (i7 < 640 || i8 < 480) ? 160 : 192;
                }
                return 192;
            }
            return 256;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            f fVar = SearchView.f5479w0;
            fVar.getClass();
            f.a();
            Method method = fVar.f735c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f5518u <= 0 || super.enoughToFilter();
        }

        @Override // k.AbstractC0898l, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f5520w) {
                d dVar = this.f5521x;
                removeCallbacks(dVar);
                post(dVar);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z7, int i7, Rect rect) {
            super.onFocusChanged(z7, i7, rect);
            SearchView searchView = this.f5519v;
            searchView.v(searchView.f5502g0);
            searchView.post(searchView.f5515t0);
            if (searchView.F.hasFocus()) {
                searchView.k();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i7, KeyEvent keyEvent) {
            if (i7 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f5519v.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i7, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z7) {
            super.onWindowFocusChanged(z7);
            if (z7 && this.f5519v.hasFocus() && getVisibility() == 0) {
                this.f5520w = true;
                Context context = getContext();
                f fVar = SearchView.f5479w0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z7) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.f5521x;
            if (!z7) {
                this.f5520w = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (!inputMethodManager.isActive(this)) {
                this.f5520w = true;
            } else {
                this.f5520w = false;
                removeCallbacks(dVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f5519v = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i7) {
            super.setThreshold(i7);
            this.f5518u = i7;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [F5.f, java.lang.Object] */
    static {
        f fVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            ?? obj = new Object();
            obj.f733a = null;
            obj.f734b = null;
            obj.f735c = null;
            f.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                obj.f733a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                obj.f734b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                obj.f735c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            fVar = obj;
        }
        f5479w0 = fVar;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.F;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f5507l0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.F;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f5507l0 = false;
    }

    public int getImeOptions() {
        return this.F.getImeOptions();
    }

    public int getInputType() {
        return this.F.getInputType();
    }

    public int getMaxWidth() {
        return this.f5508m0;
    }

    public CharSequence getQuery() {
        return this.F.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f5505j0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f5513r0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f5498c0 : getContext().getText(this.f5513r0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.W;
    }

    public int getSuggestionRowLayout() {
        return this.f5495V;
    }

    public Q.c getSuggestionsAdapter() {
        return this.f5503h0;
    }

    public final Intent i(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f5510o0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f5514s0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f5513r0.getSearchActivity());
        return intent;
    }

    public final Intent j(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5514s0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void k() {
        int i7 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.F;
        if (i7 >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        f fVar = f5479w0;
        fVar.getClass();
        f.a();
        Method method = fVar.f733a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        fVar.getClass();
        f.a();
        Method method2 = fVar.f734b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void l() {
        SearchAutoComplete searchAutoComplete = this.F;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f5501f0) {
            clearFocus();
            v(true);
        }
    }

    public final void m(int i7) {
        int i8;
        Uri parse;
        String h7;
        Cursor cursor = this.f5503h0.f2823s;
        if (cursor != null && cursor.moveToPosition(i7)) {
            Intent intent = null;
            try {
                int i9 = View$OnClickListenerC0855G0.f11880N;
                String h8 = View$OnClickListenerC0855G0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h8 == null) {
                    h8 = this.f5513r0.getSuggestIntentAction();
                }
                if (h8 == null) {
                    h8 = "android.intent.action.SEARCH";
                }
                String h9 = View$OnClickListenerC0855G0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h9 == null) {
                    h9 = this.f5513r0.getSuggestIntentData();
                }
                if (h9 != null && (h7 = View$OnClickListenerC0855G0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    h9 = h9 + "/" + Uri.encode(h7);
                }
                if (h9 == null) {
                    parse = null;
                } else {
                    parse = Uri.parse(h9);
                }
                intent = i(h8, parse, View$OnClickListenerC0855G0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), View$OnClickListenerC0855G0.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e3) {
                try {
                    i8 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i8 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i8 + " returned exception.", e3);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e7) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e7);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.F;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void n(int i7) {
        String c5;
        Editable text = this.F.getText();
        Cursor cursor = this.f5503h0.f2823s;
        if (cursor != null) {
            if (cursor.moveToPosition(i7) && (c5 = this.f5503h0.c(cursor)) != null) {
                setQuery(c5);
            } else {
                setQuery(text);
            }
        }
    }

    public final void o(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f5515t0);
        post(this.f5516u0);
        super.onDetachedFromWindow();
    }

    @Override // k.AbstractC0883d0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        if (z7) {
            int[] iArr = this.f5491R;
            SearchAutoComplete searchAutoComplete = this.F;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f5492S;
            getLocationInWindow(iArr2);
            int i11 = iArr[1] - iArr2[1];
            int i12 = iArr[0] - iArr2[0];
            Rect rect = this.f5489P;
            rect.set(i12, i11, searchAutoComplete.getWidth() + i12, searchAutoComplete.getHeight() + i11);
            int i13 = rect.left;
            int i14 = rect.right;
            int i15 = i10 - i8;
            Rect rect2 = this.f5490Q;
            rect2.set(i13, 0, i14, i15);
            C0851E0 c0851e0 = this.f5488O;
            if (c0851e0 == null) {
                C0851E0 c0851e02 = new C0851E0(rect2, rect, searchAutoComplete);
                this.f5488O = c0851e02;
                setTouchDelegate(c0851e02);
                return;
            }
            c0851e0.f11870b.set(rect2);
            Rect rect3 = c0851e0.d;
            rect3.set(rect2);
            int i16 = -c0851e0.f11872e;
            rect3.inset(i16, i16);
            c0851e0.f11871c.set(rect);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r0 <= 0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    @Override // k.AbstractC0883d0, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.f5502g0
            if (r0 == 0) goto L8
            super.onMeasure(r4, r5)
            return
        L8:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2e
            if (r0 == 0) goto L24
            if (r0 == r2) goto L1b
            goto L38
        L1b:
            int r0 = r3.f5508m0
            if (r0 <= 0) goto L38
        L1f:
            int r4 = java.lang.Math.min(r0, r4)
            goto L38
        L24:
            int r4 = r3.f5508m0
            if (r4 <= 0) goto L29
            goto L38
        L29:
            int r4 = r3.getPreferredWidth()
            goto L38
        L2e:
            int r0 = r3.f5508m0
            if (r0 <= 0) goto L33
            goto L1f
        L33:
            int r0 = r3.getPreferredWidth()
            goto L1f
        L38:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L4a
            if (r0 == 0) goto L45
            goto L52
        L45:
            int r5 = r3.getPreferredHeight()
            goto L52
        L4a:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L52:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0849D0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0849D0 c0849d0 = (C0849D0) parcelable;
        super.onRestoreInstanceState(c0849d0.f2938q);
        v(c0849d0.f11868s);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, S.b, k.D0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new S.b(super.onSaveInstanceState());
        bVar.f11868s = this.f5502g0;
        return bVar;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z7) {
        super.onWindowFocusChanged(z7);
        post(this.f5515t0);
    }

    public final void p() {
        SearchAutoComplete searchAutoComplete = this.F;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f5513r0 != null) {
                getContext().startActivity(i("android.intent.action.SEARCH", null, null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public final void q() {
        boolean z7 = true;
        boolean z8 = !TextUtils.isEmpty(this.F.getText());
        if (!z8 && (!this.f5501f0 || this.f5511p0)) {
            z7 = false;
        }
        int i7 = z7 ? 0 : 8;
        ImageView imageView = this.f5485L;
        imageView.setVisibility(i7);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(z8 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void r() {
        int[] iArr = this.F.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f5481H.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f5482I.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i7, Rect rect) {
        if (this.f5507l0 || !isFocusable()) {
            return false;
        }
        if (!this.f5502g0) {
            boolean requestFocus = this.F.requestFocus(i7, rect);
            if (requestFocus) {
                v(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i7, rect);
    }

    public final void s() {
        Drawable drawable;
        SpannableStringBuilder queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z7 = this.f5501f0;
        SearchAutoComplete searchAutoComplete = this.F;
        if (z7 && (drawable = this.f5494U) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f5514s0 = bundle;
    }

    public void setIconified(boolean z7) {
        if (z7) {
            l();
            return;
        }
        v(false);
        SearchAutoComplete searchAutoComplete = this.F;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f5500e0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z7) {
        if (this.f5501f0 == z7) {
            return;
        }
        this.f5501f0 = z7;
        v(z7);
        s();
    }

    public void setImeOptions(int i7) {
        this.F.setImeOptions(i7);
    }

    public void setInputType(int i7) {
        this.F.setInputType(i7);
    }

    public void setMaxWidth(int i7) {
        this.f5508m0 = i7;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f5499d0 = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f5500e0 = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f5505j0 = charSequence;
        s();
    }

    public void setQueryRefinementEnabled(boolean z7) {
        int i7;
        this.f5506k0 = z7;
        Q.c cVar = this.f5503h0;
        if (cVar instanceof View$OnClickListenerC0855G0) {
            View$OnClickListenerC0855G0 view$OnClickListenerC0855G0 = (View$OnClickListenerC0855G0) cVar;
            if (z7) {
                i7 = 2;
            } else {
                i7 = 1;
            }
            view$OnClickListenerC0855G0.F = i7;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        int i7;
        this.f5513r0 = searchableInfo;
        Intent intent = null;
        boolean z7 = true;
        SearchAutoComplete searchAutoComplete = this.F;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f5513r0.getImeOptions());
            int inputType = this.f5513r0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f5513r0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            Q.c cVar = this.f5503h0;
            if (cVar != null) {
                cVar.b(null);
            }
            if (this.f5513r0.getSuggestAuthority() != null) {
                View$OnClickListenerC0855G0 view$OnClickListenerC0855G0 = new View$OnClickListenerC0855G0(getContext(), this, this.f5513r0, this.f5517v0);
                this.f5503h0 = view$OnClickListenerC0855G0;
                searchAutoComplete.setAdapter(view$OnClickListenerC0855G0);
                View$OnClickListenerC0855G0 view$OnClickListenerC0855G02 = (View$OnClickListenerC0855G0) this.f5503h0;
                if (this.f5506k0) {
                    i7 = 2;
                } else {
                    i7 = 1;
                }
                view$OnClickListenerC0855G02.F = i7;
            }
            s();
        }
        SearchableInfo searchableInfo2 = this.f5513r0;
        boolean z8 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f5513r0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f5496a0;
            } else if (this.f5513r0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f5497b0;
            }
            if (intent != null) {
                if (getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
                    z7 = false;
                }
                z8 = z7;
            }
        }
        this.f5509n0 = z8;
        if (z8) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        v(this.f5502g0);
    }

    public void setSubmitButtonEnabled(boolean z7) {
        this.f5504i0 = z7;
        v(this.f5502g0);
    }

    public void setSuggestionsAdapter(Q.c cVar) {
        this.f5503h0 = cVar;
        this.F.setAdapter(cVar);
    }

    public final void t() {
        int i7;
        if ((this.f5504i0 || this.f5509n0) && !this.f5502g0 && (this.f5484K.getVisibility() == 0 || this.f5486M.getVisibility() == 0)) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f5482I.setVisibility(i7);
    }

    public final void u(boolean z7) {
        int i7;
        boolean z8 = this.f5504i0;
        if (z8 && ((z8 || this.f5509n0) && !this.f5502g0 && hasFocus() && (z7 || !this.f5509n0))) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f5484K.setVisibility(i7);
    }

    public final void v(boolean z7) {
        int i7;
        int i8;
        int i9;
        this.f5502g0 = z7;
        int i10 = 8;
        if (z7) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        boolean isEmpty = TextUtils.isEmpty(this.F.getText());
        this.f5483J.setVisibility(i7);
        u(!isEmpty);
        if (z7) {
            i8 = 8;
        } else {
            i8 = 0;
        }
        this.f5480G.setVisibility(i8);
        ImageView imageView = this.f5493T;
        if (imageView.getDrawable() != null && !this.f5501f0) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        imageView.setVisibility(i9);
        q();
        if (this.f5509n0 && !this.f5502g0 && isEmpty) {
            this.f5484K.setVisibility(8);
            i10 = 0;
        }
        this.f5486M.setVisibility(i10);
        t();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f5489P = new Rect();
        this.f5490Q = new Rect();
        this.f5491R = new int[2];
        this.f5492S = new int[2];
        this.f5515t0 = new RunnableC0923x0(this, 0);
        this.f5516u0 = new RunnableC0923x0(this, 1);
        this.f5517v0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        C0307n0 c0307n0 = new C0307n0(this, 1);
        z0 z0Var = new z0(this);
        C0885e0 c0885e0 = new C0885e0(1, this);
        L3.a aVar2 = new L3.a(2, this);
        int[] iArr = AbstractC0565a.f9355r;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i7, 0);
        g5.b bVar2 = new g5.b(context, 4, obtainStyledAttributes);
        O.h(this, context, iArr, attributeSet, obtainStyledAttributes, i7);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.F = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f5480G = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f5481H = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f5482I = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f5483J = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f5484K = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f5485L = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f5486M = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f5493T = imageView5;
        findViewById.setBackground(bVar2.z(10));
        findViewById2.setBackground(bVar2.z(14));
        imageView.setImageDrawable(bVar2.z(13));
        imageView2.setImageDrawable(bVar2.z(7));
        imageView3.setImageDrawable(bVar2.z(4));
        imageView4.setImageDrawable(bVar2.z(16));
        imageView5.setImageDrawable(bVar2.z(13));
        this.f5494U = bVar2.z(12);
        p6.d.G(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f5495V = obtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.W = obtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(aVar2);
        searchAutoComplete.setOnEditorActionListener(c0307n0);
        searchAutoComplete.setOnItemClickListener(z0Var);
        searchAutoComplete.setOnItemSelectedListener(c0885e0);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new L3.b(2, this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f5498c0 = obtainStyledAttributes.getText(6);
        this.f5505j0 = obtainStyledAttributes.getText(11);
        int i8 = obtainStyledAttributes.getInt(3, -1);
        if (i8 != -1) {
            setImeOptions(i8);
        }
        int i9 = obtainStyledAttributes.getInt(2, -1);
        if (i9 != -1) {
            setInputType(i9);
        }
        setFocusable(obtainStyledAttributes.getBoolean(0, true));
        bVar2.D();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f5496a0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f5497b0 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f5487N = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC0925y0(0, this));
        }
        v(this.f5501f0);
        s();
    }

    public void setOnCloseListener(InterfaceC0843A0 interfaceC0843A0) {
    }

    public void setOnQueryTextListener(InterfaceC0845B0 interfaceC0845B0) {
    }

    public void setOnSuggestionListener(InterfaceC0847C0 interfaceC0847C0) {
    }
}
