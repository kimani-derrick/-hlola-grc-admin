package androidx.leanback.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Handler;
import android.speech.SpeechRecognizer;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.boxhdo.android.tv.R;
/* loaded from: classes.dex */
public class SearchBar extends RelativeLayout {

    /* renamed from: N  reason: collision with root package name */
    public static final /* synthetic */ int f6490N = 0;

    /* renamed from: A  reason: collision with root package name */
    public Drawable f6491A;

    /* renamed from: B  reason: collision with root package name */
    public final int f6492B;

    /* renamed from: C  reason: collision with root package name */
    public final int f6493C;

    /* renamed from: D  reason: collision with root package name */
    public final int f6494D;

    /* renamed from: E  reason: collision with root package name */
    public final int f6495E;
    public final int F;

    /* renamed from: G  reason: collision with root package name */
    public final int f6496G;

    /* renamed from: H  reason: collision with root package name */
    public SpeechRecognizer f6497H;

    /* renamed from: I  reason: collision with root package name */
    public boolean f6498I;

    /* renamed from: J  reason: collision with root package name */
    public SoundPool f6499J;

    /* renamed from: K  reason: collision with root package name */
    public final SparseIntArray f6500K;

    /* renamed from: L  reason: collision with root package name */
    public boolean f6501L;

    /* renamed from: M  reason: collision with root package name */
    public final Context f6502M;

    /* renamed from: q  reason: collision with root package name */
    public SearchEditText f6503q;

    /* renamed from: r  reason: collision with root package name */
    public SpeechOrbView f6504r;

    /* renamed from: s  reason: collision with root package name */
    public ImageView f6505s;

    /* renamed from: t  reason: collision with root package name */
    public String f6506t;

    /* renamed from: u  reason: collision with root package name */
    public String f6507u;

    /* renamed from: v  reason: collision with root package name */
    public String f6508v;

    /* renamed from: w  reason: collision with root package name */
    public Drawable f6509w;

    /* renamed from: x  reason: collision with root package name */
    public final Handler f6510x;

    /* renamed from: y  reason: collision with root package name */
    public final InputMethodManager f6511y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f6512z;

    public SearchBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f6510x = new Handler();
        this.f6512z = false;
        this.f6500K = new SparseIntArray();
        this.f6501L = false;
        this.f6502M = context;
        Resources resources = getResources();
        LayoutInflater.from(getContext()).inflate(R.layout.lb_search_bar, (ViewGroup) this, true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.lb_search_bar_height));
        layoutParams.addRule(10, -1);
        setLayoutParams(layoutParams);
        setBackgroundColor(0);
        setClipChildren(false);
        this.f6506t = "";
        this.f6511y = (InputMethodManager) context.getSystemService("input_method");
        this.f6493C = resources.getColor(R.color.lb_search_bar_text_speech_mode);
        this.f6492B = resources.getColor(R.color.lb_search_bar_text);
        this.f6496G = resources.getInteger(R.integer.lb_search_bar_speech_mode_background_alpha);
        this.F = resources.getInteger(R.integer.lb_search_bar_text_mode_background_alpha);
        this.f6495E = resources.getColor(R.color.lb_search_bar_hint_speech_mode);
        this.f6494D = resources.getColor(R.color.lb_search_bar_hint);
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
    }

    public final void a() {
        if (this.f6501L) {
            return;
        }
        if (!hasFocus()) {
            requestFocus();
        }
        if (this.f6497H == null) {
            return;
        }
        if (getContext().checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            throw new IllegalStateException("android.permission.RECORD_AUDIO required for search");
        }
        this.f6501L = true;
        this.f6503q.setText("");
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
        this.f6497H.setRecognitionListener(new C0309o0(this));
        this.f6498I = true;
        this.f6497H.startListening(intent);
    }

    public final void b() {
        if (this.f6501L) {
            this.f6503q.setText(this.f6506t);
            this.f6503q.setHint(this.f6507u);
            this.f6501L = false;
            if (this.f6497H == null) {
                return;
            }
            this.f6504r.c();
            if (this.f6498I) {
                this.f6497H.cancel();
                this.f6498I = false;
            }
            this.f6497H.setRecognitionListener(null);
        }
    }

    public final void c() {
        String string = getResources().getString(R.string.lb_search_bar_hint);
        if (!TextUtils.isEmpty(this.f6508v)) {
            if (this.f6504r.isFocused()) {
                string = getResources().getString(R.string.lb_search_bar_hint_with_title_speech, this.f6508v);
            } else {
                string = getResources().getString(R.string.lb_search_bar_hint_with_title, this.f6508v);
            }
        } else if (this.f6504r.isFocused()) {
            string = getResources().getString(R.string.lb_search_bar_hint_speech);
        }
        this.f6507u = string;
        SearchEditText searchEditText = this.f6503q;
        if (searchEditText != null) {
            searchEditText.setHint(string);
        }
    }

    public final void d(boolean z7) {
        SearchEditText searchEditText;
        int i7;
        if (z7) {
            this.f6491A.setAlpha(this.f6496G);
            boolean isFocused = this.f6504r.isFocused();
            i7 = this.f6495E;
            if (isFocused) {
                this.f6503q.setTextColor(i7);
            } else {
                this.f6503q.setTextColor(this.f6493C);
            }
            searchEditText = this.f6503q;
        } else {
            this.f6491A.setAlpha(this.F);
            this.f6503q.setTextColor(this.f6492B);
            searchEditText = this.f6503q;
            i7 = this.f6494D;
        }
        searchEditText.setHintTextColor(i7);
        c();
    }

    public Drawable getBadgeDrawable() {
        return this.f6509w;
    }

    public CharSequence getHint() {
        return this.f6507u;
    }

    public String getTitle() {
        return this.f6508v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6499J = new SoundPool(2, 1, 0);
        int[] iArr = {R.raw.lb_voice_failure, R.raw.lb_voice_open, R.raw.lb_voice_no_input, R.raw.lb_voice_success};
        for (int i7 = 0; i7 < 4; i7++) {
            int i8 = iArr[i7];
            this.f6500K.put(i8, this.f6499J.load(this.f6502M, i8, 1));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        b();
        this.f6499J.release();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f6491A = ((RelativeLayout) findViewById(R.id.lb_search_bar_items)).getBackground();
        this.f6503q = (SearchEditText) findViewById(R.id.lb_search_text_editor);
        ImageView imageView = (ImageView) findViewById(R.id.lb_search_bar_badge);
        this.f6505s = imageView;
        Drawable drawable = this.f6509w;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        this.f6503q.setOnFocusChangeListener(new View$OnFocusChangeListenerC0301k0(this, 0));
        this.f6503q.addTextChangedListener(new C0305m0(this, new RunnableC0303l0(this, 0)));
        this.f6503q.setOnKeyboardDismissListener(new Z5.n(this));
        this.f6503q.setOnEditorActionListener(new C0307n0(this, 0));
        this.f6503q.setPrivateImeOptions("escapeNorth,voiceDismiss");
        SpeechOrbView speechOrbView = (SpeechOrbView) findViewById(R.id.lb_search_bar_speech_orb);
        this.f6504r = speechOrbView;
        speechOrbView.setOnOrbClickedListener(new L3.e(4, this));
        this.f6504r.setOnFocusChangeListener(new View$OnFocusChangeListenerC0301k0(this, 1));
        d(hasFocus());
        c();
    }

    public void setBadgeDrawable(Drawable drawable) {
        ImageView imageView;
        int i7;
        this.f6509w = drawable;
        ImageView imageView2 = this.f6505s;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
            if (drawable != null) {
                imageView = this.f6505s;
                i7 = 0;
            } else {
                imageView = this.f6505s;
                i7 = 8;
            }
            imageView.setVisibility(i7);
        }
    }

    @Override // android.view.View
    public void setNextFocusDownId(int i7) {
        this.f6504r.setNextFocusDownId(i7);
        this.f6503q.setNextFocusDownId(i7);
    }

    public void setPermissionListener(InterfaceC0313q0 interfaceC0313q0) {
    }

    public void setSearchAffordanceColors(t0 t0Var) {
        SpeechOrbView speechOrbView = this.f6504r;
        if (speechOrbView != null) {
            speechOrbView.setNotListeningOrbColors(t0Var);
        }
    }

    public void setSearchAffordanceColorsInListening(t0 t0Var) {
        SpeechOrbView speechOrbView = this.f6504r;
        if (speechOrbView != null) {
            speechOrbView.setListeningOrbColors(t0Var);
        }
    }

    public void setSearchBarListener(InterfaceC0311p0 interfaceC0311p0) {
    }

    public void setSearchQuery(String str) {
        b();
        this.f6503q.setText(str);
        setSearchQueryInternal(str);
    }

    public void setSearchQueryInternal(String str) {
        if (TextUtils.equals(this.f6506t, str)) {
            return;
        }
        this.f6506t = str;
    }

    @Deprecated
    public void setSpeechRecognitionCallback(F0 f02) {
    }

    public void setSpeechRecognizer(SpeechRecognizer speechRecognizer) {
        b();
        SpeechRecognizer speechRecognizer2 = this.f6497H;
        if (speechRecognizer2 != null) {
            speechRecognizer2.setRecognitionListener(null);
            if (this.f6498I) {
                this.f6497H.cancel();
                this.f6498I = false;
            }
        }
        this.f6497H = speechRecognizer;
    }

    public void setTitle(String str) {
        this.f6508v = str;
        c();
    }
}
