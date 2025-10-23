package X2;

import O3.AbstractC0072p;
import O3.AbstractC0080y;
import O3.U;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.boxhdo.android.tv.R;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import e2.AbstractC0592I;
import e2.C0585B;
import e2.H0;
import e2.I0;
import e2.J0;
import e2.K0;
import e2.L0;
import e2.p0;
import e2.q0;
import e2.v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class w extends FrameLayout {

    /* renamed from: N0  reason: collision with root package name */
    public static final float[] f4206N0;

    /* renamed from: A  reason: collision with root package name */
    public final PopupWindow f4207A;

    /* renamed from: A0  reason: collision with root package name */
    public boolean f4208A0;

    /* renamed from: B  reason: collision with root package name */
    public final int f4209B;

    /* renamed from: B0  reason: collision with root package name */
    public boolean f4210B0;

    /* renamed from: C  reason: collision with root package name */
    public final View f4211C;

    /* renamed from: C0  reason: collision with root package name */
    public boolean f4212C0;

    /* renamed from: D  reason: collision with root package name */
    public final View f4213D;

    /* renamed from: D0  reason: collision with root package name */
    public boolean f4214D0;

    /* renamed from: E  reason: collision with root package name */
    public final View f4215E;

    /* renamed from: E0  reason: collision with root package name */
    public int f4216E0;
    public final View F;

    /* renamed from: F0  reason: collision with root package name */
    public int f4217F0;

    /* renamed from: G  reason: collision with root package name */
    public final View f4218G;
    public int G0;

    /* renamed from: H  reason: collision with root package name */
    public final TextView f4219H;

    /* renamed from: H0  reason: collision with root package name */
    public long[] f4220H0;

    /* renamed from: I  reason: collision with root package name */
    public final TextView f4221I;

    /* renamed from: I0  reason: collision with root package name */
    public boolean[] f4222I0;

    /* renamed from: J  reason: collision with root package name */
    public final ImageView f4223J;

    /* renamed from: J0  reason: collision with root package name */
    public final long[] f4224J0;

    /* renamed from: K  reason: collision with root package name */
    public final ImageView f4225K;

    /* renamed from: K0  reason: collision with root package name */
    public final boolean[] f4226K0;

    /* renamed from: L  reason: collision with root package name */
    public final View f4227L;

    /* renamed from: L0  reason: collision with root package name */
    public long f4228L0;

    /* renamed from: M  reason: collision with root package name */
    public final ImageView f4229M;

    /* renamed from: M0  reason: collision with root package name */
    public boolean f4230M0;

    /* renamed from: N  reason: collision with root package name */
    public final ImageView f4231N;

    /* renamed from: O  reason: collision with root package name */
    public final ImageView f4232O;

    /* renamed from: P  reason: collision with root package name */
    public final View f4233P;

    /* renamed from: Q  reason: collision with root package name */
    public final View f4234Q;

    /* renamed from: R  reason: collision with root package name */
    public final View f4235R;

    /* renamed from: S  reason: collision with root package name */
    public final TextView f4236S;

    /* renamed from: T  reason: collision with root package name */
    public final TextView f4237T;

    /* renamed from: U  reason: collision with root package name */
    public final H f4238U;

    /* renamed from: V  reason: collision with root package name */
    public final StringBuilder f4239V;
    public final Formatter W;

    /* renamed from: a0  reason: collision with root package name */
    public final H0 f4240a0;

    /* renamed from: b0  reason: collision with root package name */
    public final I0 f4241b0;

    /* renamed from: c0  reason: collision with root package name */
    public final E1.b f4242c0;

    /* renamed from: d0  reason: collision with root package name */
    public final Drawable f4243d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Drawable f4244e0;

    /* renamed from: f0  reason: collision with root package name */
    public final Drawable f4245f0;

    /* renamed from: g0  reason: collision with root package name */
    public final String f4246g0;

    /* renamed from: h0  reason: collision with root package name */
    public final String f4247h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f4248i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Drawable f4249j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Drawable f4250k0;

    /* renamed from: l0  reason: collision with root package name */
    public final float f4251l0;

    /* renamed from: m0  reason: collision with root package name */
    public final float f4252m0;

    /* renamed from: n0  reason: collision with root package name */
    public final String f4253n0;

    /* renamed from: o0  reason: collision with root package name */
    public final String f4254o0;

    /* renamed from: p0  reason: collision with root package name */
    public final Drawable f4255p0;

    /* renamed from: q  reason: collision with root package name */
    public final B f4256q;

    /* renamed from: q0  reason: collision with root package name */
    public final Drawable f4257q0;

    /* renamed from: r  reason: collision with root package name */
    public final Resources f4258r;

    /* renamed from: r0  reason: collision with root package name */
    public final String f4259r0;

    /* renamed from: s  reason: collision with root package name */
    public final View$OnClickListenerC0130l f4260s;

    /* renamed from: s0  reason: collision with root package name */
    public final String f4261s0;

    /* renamed from: t  reason: collision with root package name */
    public final CopyOnWriteArrayList f4262t;

    /* renamed from: t0  reason: collision with root package name */
    public final Drawable f4263t0;

    /* renamed from: u  reason: collision with root package name */
    public final RecyclerView f4264u;

    /* renamed from: u0  reason: collision with root package name */
    public final Drawable f4265u0;

    /* renamed from: v  reason: collision with root package name */
    public final r f4266v;

    /* renamed from: v0  reason: collision with root package name */
    public final String f4267v0;

    /* renamed from: w  reason: collision with root package name */
    public final o f4268w;

    /* renamed from: w0  reason: collision with root package name */
    public final String f4269w0;

    /* renamed from: x  reason: collision with root package name */
    public final C0129k f4270x;

    /* renamed from: x0  reason: collision with root package name */
    public v0 f4271x0;

    /* renamed from: y  reason: collision with root package name */
    public final C0129k f4272y;
    public InterfaceC0131m y0;

    /* renamed from: z  reason: collision with root package name */
    public final T4.c f4273z;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f4274z0;

    static {
        AbstractC0592I.a("goog.exo.ui");
        f4206N0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public w(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        View$OnClickListenerC0130l view$OnClickListenerC0130l;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        Typeface b7;
        TextView textView;
        TextView textView2;
        ImageView imageView;
        boolean z21;
        this.f4216E0 = 5000;
        this.G0 = 0;
        this.f4217F0 = 200;
        int i7 = R.layout.exo_styled_player_control_view;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC0124f.f4174c, 0, 0);
            try {
                i7 = obtainStyledAttributes.getResourceId(6, R.layout.exo_styled_player_control_view);
                this.f4216E0 = obtainStyledAttributes.getInt(21, this.f4216E0);
                this.G0 = obtainStyledAttributes.getInt(9, this.G0);
                boolean z22 = obtainStyledAttributes.getBoolean(18, true);
                boolean z23 = obtainStyledAttributes.getBoolean(15, true);
                boolean z24 = obtainStyledAttributes.getBoolean(17, true);
                boolean z25 = obtainStyledAttributes.getBoolean(16, true);
                boolean z26 = obtainStyledAttributes.getBoolean(19, false);
                boolean z27 = obtainStyledAttributes.getBoolean(20, false);
                boolean z28 = obtainStyledAttributes.getBoolean(22, false);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(23, this.f4217F0));
                boolean z29 = obtainStyledAttributes.getBoolean(2, true);
                obtainStyledAttributes.recycle();
                z8 = z22;
                z12 = z27;
                z11 = z25;
                z14 = z28;
                z9 = z23;
                z13 = z26;
                z10 = z24;
                z7 = z29;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z7 = true;
            z8 = true;
            z9 = true;
            z10 = true;
            z11 = true;
            z12 = false;
            z13 = false;
            z14 = false;
        }
        LayoutInflater.from(context).inflate(i7, this);
        setDescendantFocusability(262144);
        View$OnClickListenerC0130l view$OnClickListenerC0130l2 = new View$OnClickListenerC0130l(this);
        this.f4260s = view$OnClickListenerC0130l2;
        this.f4262t = new CopyOnWriteArrayList();
        this.f4240a0 = new H0();
        this.f4241b0 = new I0();
        StringBuilder sb = new StringBuilder();
        this.f4239V = sb;
        this.W = new Formatter(sb, Locale.getDefault());
        this.f4220H0 = new long[0];
        this.f4222I0 = new boolean[0];
        this.f4224J0 = new long[0];
        this.f4226K0 = new boolean[0];
        this.f4242c0 = new E1.b(4, this);
        this.f4236S = (TextView) findViewById(R.id.exo_duration);
        this.f4237T = (TextView) findViewById(R.id.exo_position);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_subtitle);
        this.f4229M = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(view$OnClickListenerC0130l2);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.f4231N = imageView3;
        C1.b bVar = new C1.b(1, this);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(bVar);
        }
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.f4232O = imageView4;
        C1.b bVar2 = new C1.b(1, this);
        if (imageView4 != null) {
            imageView4.setVisibility(8);
            imageView4.setOnClickListener(bVar2);
        }
        View findViewById = findViewById(R.id.exo_settings);
        this.f4233P = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(view$OnClickListenerC0130l2);
        }
        View findViewById2 = findViewById(R.id.exo_playback_speed);
        this.f4234Q = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(view$OnClickListenerC0130l2);
        }
        View findViewById3 = findViewById(R.id.exo_audio_track);
        this.f4235R = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(view$OnClickListenerC0130l2);
        }
        H h7 = (H) findViewById(R.id.exo_progress);
        View findViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (h7 != null) {
            this.f4238U = h7;
            z15 = z12;
            z16 = z13;
        } else if (findViewById4 != null) {
            z15 = z12;
            z16 = z13;
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, attributeSet, 2132017414);
            defaultTimeBar.setId(R.id.exo_progress);
            defaultTimeBar.setLayoutParams(findViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById4.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById4);
            viewGroup.removeView(findViewById4);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            this.f4238U = defaultTimeBar;
        } else {
            z15 = z12;
            z16 = z13;
            this.f4238U = null;
        }
        H h8 = this.f4238U;
        if (h8 != null) {
            ((DefaultTimeBar) h8).f8145N.add(view$OnClickListenerC0130l2);
        }
        View findViewById5 = findViewById(R.id.exo_play_pause);
        this.f4215E = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(view$OnClickListenerC0130l2);
        }
        View findViewById6 = findViewById(R.id.exo_prev);
        this.f4211C = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(view$OnClickListenerC0130l2);
        }
        View findViewById7 = findViewById(R.id.exo_next);
        this.f4213D = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(view$OnClickListenerC0130l2);
        }
        ThreadLocal threadLocal = C.o.f343a;
        if (context.isRestricted()) {
            view$OnClickListenerC0130l = view$OnClickListenerC0130l2;
            z19 = z7;
            z20 = z14;
            z17 = z15;
            z18 = z16;
            b7 = null;
        } else {
            view$OnClickListenerC0130l = view$OnClickListenerC0130l2;
            z17 = z15;
            z18 = z16;
            z19 = z7;
            z20 = z14;
            b7 = C.o.b(context, R.font.roboto_medium_numbers, new TypedValue(), 0, null, false, false);
        }
        View findViewById8 = findViewById(R.id.exo_rew);
        if (findViewById8 == null) {
            textView = (TextView) findViewById(R.id.exo_rew_with_amount);
        } else {
            textView = null;
        }
        this.f4221I = textView;
        if (textView != null) {
            textView.setTypeface(b7);
        }
        findViewById8 = findViewById8 == null ? textView : findViewById8;
        this.f4218G = findViewById8;
        View$OnClickListenerC0130l view$OnClickListenerC0130l3 = view$OnClickListenerC0130l;
        if (findViewById8 != null) {
            findViewById8.setOnClickListener(view$OnClickListenerC0130l3);
        }
        View findViewById9 = findViewById(R.id.exo_ffwd);
        if (findViewById9 == null) {
            textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
        } else {
            textView2 = null;
        }
        this.f4219H = textView2;
        if (textView2 != null) {
            textView2.setTypeface(b7);
        }
        findViewById9 = findViewById9 == null ? textView2 : findViewById9;
        this.F = findViewById9;
        if (findViewById9 != null) {
            findViewById9.setOnClickListener(view$OnClickListenerC0130l3);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.f4223J = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(view$OnClickListenerC0130l3);
        }
        ImageView imageView6 = (ImageView) findViewById(R.id.exo_shuffle);
        this.f4225K = imageView6;
        if (imageView6 != null) {
            imageView6.setOnClickListener(view$OnClickListenerC0130l3);
        }
        Resources resources = context.getResources();
        this.f4258r = resources;
        this.f4251l0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f4252m0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        View findViewById10 = findViewById(R.id.exo_vr);
        this.f4227L = findViewById10;
        if (findViewById10 != null) {
            k(findViewById10, false);
        }
        B b8 = new B(this);
        this.f4256q = b8;
        b8.f4087C = z19;
        r rVar = new r(this, new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{Z2.H.s(context, resources, R.drawable.exo_styled_controls_speed), Z2.H.s(context, resources, R.drawable.exo_styled_controls_audiotrack)});
        this.f4266v = rVar;
        this.f4209B = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.f4264u = recyclerView;
        recyclerView.setAdapter(rVar);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.f4207A = popupWindow;
        if (Z2.H.f4603a < 23) {
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        }
        popupWindow.setOnDismissListener(view$OnClickListenerC0130l3);
        this.f4230M0 = true;
        this.f4273z = new T4.c(getResources());
        this.f4255p0 = Z2.H.s(context, resources, R.drawable.exo_styled_controls_subtitle_on);
        this.f4257q0 = Z2.H.s(context, resources, R.drawable.exo_styled_controls_subtitle_off);
        this.f4259r0 = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.f4261s0 = resources.getString(R.string.exo_controls_cc_disabled_description);
        this.f4270x = new C0129k(this, 1);
        this.f4272y = new C0129k(this, 0);
        this.f4268w = new o(this, resources.getStringArray(R.array.exo_controls_playback_speeds), f4206N0);
        this.f4263t0 = Z2.H.s(context, resources, R.drawable.exo_styled_controls_fullscreen_exit);
        this.f4265u0 = Z2.H.s(context, resources, R.drawable.exo_styled_controls_fullscreen_enter);
        this.f4243d0 = Z2.H.s(context, resources, R.drawable.exo_styled_controls_repeat_off);
        this.f4244e0 = Z2.H.s(context, resources, R.drawable.exo_styled_controls_repeat_one);
        this.f4245f0 = Z2.H.s(context, resources, R.drawable.exo_styled_controls_repeat_all);
        this.f4249j0 = Z2.H.s(context, resources, R.drawable.exo_styled_controls_shuffle_on);
        this.f4250k0 = Z2.H.s(context, resources, R.drawable.exo_styled_controls_shuffle_off);
        this.f4267v0 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.f4269w0 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.f4246g0 = resources.getString(R.string.exo_controls_repeat_off_description);
        this.f4247h0 = resources.getString(R.string.exo_controls_repeat_one_description);
        this.f4248i0 = resources.getString(R.string.exo_controls_repeat_all_description);
        this.f4253n0 = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.f4254o0 = resources.getString(R.string.exo_controls_shuffle_off_description);
        b8.i((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        b8.i(findViewById9, z9);
        b8.i(findViewById8, z8);
        b8.i(findViewById6, z10);
        b8.i(findViewById7, z11);
        b8.i(imageView6, z18);
        b8.i(imageView2, z17);
        b8.i(findViewById10, z20);
        if (this.G0 != 0) {
            imageView = imageView5;
            z21 = true;
        } else {
            imageView = imageView5;
            z21 = false;
        }
        b8.i(imageView, z21);
        addOnLayoutChangeListener(new View$OnLayoutChangeListenerC0128j(0, this));
    }

    public static void a(w wVar) {
        if (wVar.y0 != null) {
            boolean z7 = !wVar.f4274z0;
            wVar.f4274z0 = z7;
            String str = wVar.f4269w0;
            Drawable drawable = wVar.f4265u0;
            String str2 = wVar.f4267v0;
            Drawable drawable2 = wVar.f4263t0;
            ImageView imageView = wVar.f4231N;
            if (imageView != null) {
                if (z7) {
                    imageView.setImageDrawable(drawable2);
                    imageView.setContentDescription(str2);
                } else {
                    imageView.setImageDrawable(drawable);
                    imageView.setContentDescription(str);
                }
            }
            boolean z8 = wVar.f4274z0;
            ImageView imageView2 = wVar.f4232O;
            if (imageView2 != null) {
                if (z8) {
                    imageView2.setImageDrawable(drawable2);
                    imageView2.setContentDescription(str2);
                } else {
                    imageView2.setImageDrawable(drawable);
                    imageView2.setContentDescription(str);
                }
            }
            InterfaceC0131m interfaceC0131m = wVar.y0;
            if (interfaceC0131m != null) {
                ((C) interfaceC0131m).f4113s.getClass();
            }
        }
    }

    public static boolean c(v0 v0Var, I0 i02) {
        J0 O5;
        int p3;
        P1.c cVar = (P1.c) v0Var;
        if (!cVar.n(17) || (p3 = (O5 = ((C0585B) cVar).O()).p()) <= 1 || p3 > 100) {
            return false;
        }
        for (int i7 = 0; i7 < p3; i7++) {
            if (O5.n(i7, i02, 0L).f9579D == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        v0 v0Var = this.f4271x0;
        if (v0Var != null && ((P1.c) v0Var).n(13)) {
            C0585B c0585b = (C0585B) this.f4271x0;
            c0585b.q0();
            c0585b.h0(new q0(f, c0585b.f9472w0.n.f10064r));
        }
    }

    public final boolean d(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        v0 v0Var = this.f4271x0;
        if (v0Var == null || (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (((C0585B) v0Var).T() != 4) {
                    P1.c cVar = (P1.c) v0Var;
                    if (cVar.n(12)) {
                        C0585B c0585b = (C0585B) cVar;
                        c0585b.q0();
                        cVar.y(c0585b.f9430L, 12);
                    }
                }
            } else {
                if (keyCode == 89) {
                    P1.c cVar2 = (P1.c) v0Var;
                    if (cVar2.n(11)) {
                        C0585B c0585b2 = (C0585B) cVar2;
                        c0585b2.q0();
                        cVar2.y(-c0585b2.f9429K, 11);
                    }
                }
                if (keyEvent.getRepeatCount() == 0) {
                    if (keyCode != 79 && keyCode != 85) {
                        if (keyCode != 87) {
                            if (keyCode != 88) {
                                if (keyCode != 126) {
                                    if (keyCode == 127) {
                                        int i7 = Z2.H.f4603a;
                                        P1.c cVar3 = (P1.c) v0Var;
                                        if (cVar3.n(1)) {
                                            ((C0585B) cVar3).g0(false);
                                        }
                                    }
                                } else {
                                    Z2.H.D(v0Var);
                                }
                            } else {
                                P1.c cVar4 = (P1.c) v0Var;
                                if (cVar4.n(7)) {
                                    cVar4.z();
                                }
                            }
                        } else {
                            P1.c cVar5 = (P1.c) v0Var;
                            if (cVar5.n(9)) {
                                cVar5.x();
                            }
                        }
                    } else {
                        int i8 = Z2.H.f4603a;
                        C0585B c0585b3 = (C0585B) v0Var;
                        if (c0585b3.S() && c0585b3.T() != 1 && c0585b3.T() != 4) {
                            P1.c cVar6 = (P1.c) v0Var;
                            if (cVar6.n(1)) {
                                ((C0585B) cVar6).g0(false);
                            }
                        } else {
                            Z2.H.D(v0Var);
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!d(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public final void e(w0.L l7, View view) {
        this.f4264u.setAdapter(l7);
        q();
        this.f4230M0 = false;
        PopupWindow popupWindow = this.f4207A;
        popupWindow.dismiss();
        this.f4230M0 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i7 = this.f4209B;
        popupWindow.showAsDropDown(view, width - i7, (-popupWindow.getHeight()) - i7);
    }

    public final U f(L0 l02, int i7) {
        AbstractC0072p.c("initialCapacity", 4);
        Object[] objArr = new Object[4];
        O3.E e3 = l02.f9701q;
        int i8 = 0;
        for (int i9 = 0; i9 < e3.size(); i9++) {
            K0 k02 = (K0) e3.get(i9);
            if (k02.f9691r.f1135s == i7) {
                for (int i10 = 0; i10 < k02.f9690q; i10++) {
                    if (k02.d(i10)) {
                        e2.K k5 = k02.f9691r.f1136t[i10];
                        if ((k5.f9679t & 2) == 0) {
                            t tVar = new t(l02, i9, i10, this.f4273z.N(k5));
                            int i11 = i8 + 1;
                            if (objArr.length < i11) {
                                objArr = Arrays.copyOf(objArr, AbstractC0080y.f(objArr.length, i11));
                            }
                            objArr[i8] = tVar;
                            i8 = i11;
                        }
                    }
                }
            }
        }
        return O3.E.o(i8, objArr);
    }

    public final void g() {
        B b7 = this.f4256q;
        int i7 = b7.f4110z;
        if (i7 != 3 && i7 != 2) {
            b7.g();
            if (!b7.f4087C) {
                b7.j(2);
            } else if (b7.f4110z == 1) {
                b7.f4098m.start();
            } else {
                b7.n.start();
            }
        }
    }

    public v0 getPlayer() {
        return this.f4271x0;
    }

    public int getRepeatToggleModes() {
        return this.G0;
    }

    public boolean getShowShuffleButton() {
        return this.f4256q.c(this.f4225K);
    }

    public boolean getShowSubtitleButton() {
        return this.f4256q.c(this.f4229M);
    }

    public int getShowTimeoutMs() {
        return this.f4216E0;
    }

    public boolean getShowVrButton() {
        return this.f4256q.c(this.f4227L);
    }

    public final boolean h() {
        B b7 = this.f4256q;
        if (b7.f4110z == 0 && b7.f4088a.i()) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void j() {
        m();
        l();
        p();
        r();
        t();
        n();
        s();
    }

    public final void k(View view, boolean z7) {
        float f;
        if (view == null) {
            return;
        }
        view.setEnabled(z7);
        if (z7) {
            f = this.f4251l0;
        } else {
            f = this.f4252m0;
        }
        view.setAlpha(f);
    }

    public final void l() {
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        long j7;
        long j8;
        int i7;
        if (i() && this.f4208A0) {
            v0 v0Var = this.f4271x0;
            if (v0Var != null) {
                if (this.f4210B0 && c(v0Var, this.f4241b0)) {
                    i7 = 10;
                } else {
                    i7 = 5;
                }
                z8 = ((P1.c) v0Var).n(i7);
                P1.c cVar = (P1.c) v0Var;
                z9 = cVar.n(7);
                z10 = cVar.n(11);
                z11 = cVar.n(12);
                z7 = cVar.n(9);
            } else {
                z7 = false;
                z8 = false;
                z9 = false;
                z10 = false;
                z11 = false;
            }
            Resources resources = this.f4258r;
            View view = this.f4218G;
            if (z10) {
                v0 v0Var2 = this.f4271x0;
                if (v0Var2 != null) {
                    C0585B c0585b = (C0585B) v0Var2;
                    c0585b.q0();
                    j8 = c0585b.f9429K;
                } else {
                    j8 = 5000;
                }
                int i8 = (int) (j8 / 1000);
                TextView textView = this.f4221I;
                if (textView != null) {
                    textView.setText(String.valueOf(i8));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, i8, Integer.valueOf(i8)));
                }
            }
            View view2 = this.F;
            if (z11) {
                v0 v0Var3 = this.f4271x0;
                if (v0Var3 != null) {
                    C0585B c0585b2 = (C0585B) v0Var3;
                    c0585b2.q0();
                    j7 = c0585b2.f9430L;
                } else {
                    j7 = 15000;
                }
                int i9 = (int) (j7 / 1000);
                TextView textView2 = this.f4219H;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(i9));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, i9, Integer.valueOf(i9)));
                }
            }
            k(this.f4211C, z9);
            k(view, z10);
            k(view2, z11);
            k(this.f4213D, z7);
            H h7 = this.f4238U;
            if (h7 != null) {
                h7.setEnabled(z8);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            r8 = this;
            boolean r0 = r8.i()
            if (r0 == 0) goto L84
            boolean r0 = r8.f4208A0
            if (r0 != 0) goto Lc
            goto L84
        Lc:
            android.view.View r0 = r8.f4215E
            if (r0 == 0) goto L84
            e2.v0 r1 = r8.f4271x0
            int r2 = Z2.H.f4603a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            e2.B r1 = (e2.C0585B) r1
            boolean r4 = r1.S()
            if (r4 == 0) goto L30
            int r4 = r1.T()
            if (r4 == r3) goto L30
            int r1 = r1.T()
            r4 = 4
            if (r1 != r4) goto L2e
            goto L30
        L2e:
            r1 = r2
            goto L31
        L30:
            r1 = r3
        L31:
            if (r1 == 0) goto L37
            r4 = 2131230917(0x7f0800c5, float:1.80779E38)
            goto L3a
        L37:
            r4 = 2131230916(0x7f0800c4, float:1.8077898E38)
        L3a:
            if (r1 == 0) goto L40
            r1 = 2131951685(0x7f130045, float:1.9539791E38)
            goto L43
        L40:
            r1 = 2131951684(0x7f130044, float:1.953979E38)
        L43:
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.content.Context r6 = r8.getContext()
            android.content.res.Resources r7 = r8.f4258r
            android.graphics.drawable.Drawable r4 = Z2.H.s(r6, r7, r4)
            r5.setImageDrawable(r4)
            java.lang.String r1 = r7.getString(r1)
            r0.setContentDescription(r1)
            e2.v0 r1 = r8.f4271x0
            if (r1 == 0) goto L81
            P1.c r1 = (P1.c) r1
            boolean r1 = r1.n(r3)
            if (r1 == 0) goto L81
            e2.v0 r1 = r8.f4271x0
            r4 = 17
            P1.c r1 = (P1.c) r1
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L80
            e2.v0 r1 = r8.f4271x0
            e2.B r1 = (e2.C0585B) r1
            e2.J0 r1 = r1.O()
            boolean r1 = r1.q()
            if (r1 != 0) goto L81
        L80:
            r2 = r3
        L81:
            r8.k(r0, r2)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.w.m():void");
    }

    public final void n() {
        o oVar;
        v0 v0Var = this.f4271x0;
        if (v0Var == null) {
            return;
        }
        C0585B c0585b = (C0585B) v0Var;
        c0585b.q0();
        float f = c0585b.f9472w0.n.f10063q;
        boolean z7 = false;
        float f7 = Float.MAX_VALUE;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            oVar = this.f4268w;
            float[] fArr = oVar.f4189e;
            if (i7 >= fArr.length) {
                break;
            }
            float abs = Math.abs(f - fArr[i7]);
            if (abs < f7) {
                i8 = i7;
                f7 = abs;
            }
            i7++;
        }
        oVar.f = i8;
        String str = oVar.d[i8];
        r rVar = this.f4266v;
        rVar.f4195e[0] = str;
        if (rVar.k(1) || rVar.k(0)) {
            z7 = true;
        }
        k(this.f4233P, z7);
    }

    public final void o() {
        long j7;
        int T6;
        long j8;
        long S6;
        if (i() && this.f4208A0) {
            v0 v0Var = this.f4271x0;
            long j9 = 0;
            if (v0Var != null && ((P1.c) v0Var).n(16)) {
                long j10 = this.f4228L0;
                C0585B c0585b = (C0585B) v0Var;
                c0585b.q0();
                long H6 = c0585b.H(c0585b.f9472w0) + j10;
                long j11 = this.f4228L0;
                c0585b.q0();
                if (c0585b.f9472w0.f10043a.q()) {
                    S6 = c0585b.y0;
                } else {
                    p0 p0Var = c0585b.f9472w0;
                    if (p0Var.f10051k.d != p0Var.f10044b.d) {
                        S6 = Z2.H.S(p0Var.f10043a.n(c0585b.K(), (I0) c0585b.f2765q, 0L).f9579D);
                    } else {
                        long j12 = p0Var.f10055p;
                        if (c0585b.f9472w0.f10051k.a()) {
                            p0 p0Var2 = c0585b.f9472w0;
                            H0 h7 = p0Var2.f10043a.h(p0Var2.f10051k.f1180a, c0585b.f9423D);
                            long d = h7.d(c0585b.f9472w0.f10051k.f1181b);
                            if (d == Long.MIN_VALUE) {
                                j12 = h7.f9555t;
                            } else {
                                j12 = d;
                            }
                        }
                        p0 p0Var3 = c0585b.f9472w0;
                        J0 j02 = p0Var3.f10043a;
                        Object obj = p0Var3.f10051k.f1180a;
                        H0 h02 = c0585b.f9423D;
                        j02.h(obj, h02);
                        S6 = Z2.H.S(j12 + h02.f9556u);
                    }
                }
                j7 = S6 + j11;
                j9 = H6;
            } else {
                j7 = 0;
            }
            TextView textView = this.f4237T;
            if (textView != null && !this.f4214D0) {
                textView.setText(Z2.H.z(this.f4239V, this.W, j9));
            }
            H h8 = this.f4238U;
            if (h8 != null) {
                h8.setPosition(j9);
                this.f4238U.setBufferedPosition(j7);
            }
            removeCallbacks(this.f4242c0);
            if (v0Var == null) {
                T6 = 1;
            } else {
                T6 = ((C0585B) v0Var).T();
            }
            long j13 = 1000;
            if (v0Var != null && ((P1.c) v0Var).r()) {
                H h9 = this.f4238U;
                if (h9 != null) {
                    j8 = h9.getPreferredUpdateDelay();
                } else {
                    j8 = 1000;
                }
                long min = Math.min(j8, 1000 - (j9 % 1000));
                C0585B c0585b2 = (C0585B) v0Var;
                c0585b2.q0();
                float f = c0585b2.f9472w0.n.f10063q;
                if (f > 0.0f) {
                    j13 = ((float) min) / f;
                }
                postDelayed(this.f4242c0, Z2.H.k(j13, this.f4217F0, 1000L));
            } else if (T6 != 4 && T6 != 1) {
                postDelayed(this.f4242c0, 1000L);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        B b7 = this.f4256q;
        b7.f4088a.addOnLayoutChangeListener(b7.f4108x);
        this.f4208A0 = true;
        if (h()) {
            b7.h();
        }
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B b7 = this.f4256q;
        b7.f4088a.removeOnLayoutChangeListener(b7.f4108x);
        this.f4208A0 = false;
        removeCallbacks(this.f4242c0);
        b7.g();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        View view = this.f4256q.f4089b;
        if (view != null) {
            view.layout(0, 0, i9 - i7, i10 - i8);
        }
    }

    public final void p() {
        ImageView imageView;
        String str;
        if (i() && this.f4208A0 && (imageView = this.f4223J) != null) {
            if (this.G0 == 0) {
                k(imageView, false);
                return;
            }
            v0 v0Var = this.f4271x0;
            String str2 = this.f4246g0;
            Drawable drawable = this.f4243d0;
            if (v0Var != null && ((P1.c) v0Var).n(15)) {
                k(imageView, true);
                C0585B c0585b = (C0585B) v0Var;
                c0585b.q0();
                int i7 = c0585b.f9439U;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            imageView.setImageDrawable(this.f4245f0);
                            str = this.f4248i0;
                        } else {
                            return;
                        }
                    } else {
                        imageView.setImageDrawable(this.f4244e0);
                        str = this.f4247h0;
                    }
                    imageView.setContentDescription(str);
                    return;
                }
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str2);
                return;
            }
            k(imageView, false);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str2);
        }
    }

    public final void q() {
        RecyclerView recyclerView = this.f4264u;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i7 = this.f4209B;
        int min = Math.min(recyclerView.getMeasuredWidth(), width - (i7 * 2));
        PopupWindow popupWindow = this.f4207A;
        popupWindow.setWidth(min);
        popupWindow.setHeight(Math.min(getHeight() - (i7 * 2), recyclerView.getMeasuredHeight()));
    }

    public final void r() {
        ImageView imageView;
        if (i() && this.f4208A0 && (imageView = this.f4225K) != null) {
            v0 v0Var = this.f4271x0;
            if (!this.f4256q.c(imageView)) {
                k(imageView, false);
                return;
            }
            String str = this.f4254o0;
            Drawable drawable = this.f4250k0;
            if (v0Var != null && ((P1.c) v0Var).n(14)) {
                k(imageView, true);
                C0585B c0585b = (C0585B) v0Var;
                c0585b.q0();
                if (c0585b.f9440V) {
                    drawable = this.f4249j0;
                }
                imageView.setImageDrawable(drawable);
                c0585b.q0();
                if (c0585b.f9440V) {
                    str = this.f4253n0;
                }
            } else {
                k(imageView, false);
                imageView.setImageDrawable(drawable);
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0103, code lost:
        r18 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.w.s():void");
    }

    public void setAnimationEnabled(boolean z7) {
        this.f4256q.f4087C = z7;
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(InterfaceC0131m interfaceC0131m) {
        boolean z7;
        this.y0 = interfaceC0131m;
        boolean z8 = true;
        if (interfaceC0131m != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        ImageView imageView = this.f4231N;
        if (imageView != null) {
            if (z7) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        if (interfaceC0131m == null) {
            z8 = false;
        }
        ImageView imageView2 = this.f4232O;
        if (imageView2 != null) {
            if (z8) {
                imageView2.setVisibility(0);
            } else {
                imageView2.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (((e2.C0585B) r5).f9427I == android.os.Looper.getMainLooper()) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setPlayer(e2.v0 r5) {
        /*
            r4 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r2 = 0
            r3 = 1
            if (r0 != r1) goto Le
            r0 = r3
            goto Lf
        Le:
            r0 = r2
        Lf:
            Z2.AbstractC0156a.k(r0)
            if (r5 == 0) goto L1f
            r0 = r5
            e2.B r0 = (e2.C0585B) r0
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r0 = r0.f9427I
            if (r0 != r1) goto L20
        L1f:
            r2 = r3
        L20:
            Z2.AbstractC0156a.f(r2)
            e2.v0 r0 = r4.f4271x0
            if (r0 != r5) goto L28
            return
        L28:
            X2.l r1 = r4.f4260s
            if (r0 == 0) goto L31
            e2.B r0 = (e2.C0585B) r0
            r0.b0(r1)
        L31:
            r4.f4271x0 = r5
            if (r5 == 0) goto L3f
            e2.B r5 = (e2.C0585B) r5
            r1.getClass()
            Z2.p r5 = r5.f9421B
            r5.a(r1)
        L3f:
            r4.j()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.w.setPlayer(e2.v0):void");
    }

    public void setRepeatToggleModes(int i7) {
        this.G0 = i7;
        v0 v0Var = this.f4271x0;
        boolean z7 = false;
        if (v0Var != null && ((P1.c) v0Var).n(15)) {
            C0585B c0585b = (C0585B) this.f4271x0;
            c0585b.q0();
            int i8 = c0585b.f9439U;
            if (i7 == 0 && i8 != 0) {
                ((C0585B) this.f4271x0).i0(0);
            } else if (i7 == 1 && i8 == 2) {
                ((C0585B) this.f4271x0).i0(1);
            } else if (i7 == 2 && i8 == 1) {
                ((C0585B) this.f4271x0).i0(2);
            }
        }
        if (i7 != 0) {
            z7 = true;
        }
        this.f4256q.i(this.f4223J, z7);
        p();
    }

    public void setShowFastForwardButton(boolean z7) {
        this.f4256q.i(this.F, z7);
        l();
    }

    public void setShowMultiWindowTimeBar(boolean z7) {
        this.f4210B0 = z7;
        s();
    }

    public void setShowNextButton(boolean z7) {
        this.f4256q.i(this.f4213D, z7);
        l();
    }

    public void setShowPreviousButton(boolean z7) {
        this.f4256q.i(this.f4211C, z7);
        l();
    }

    public void setShowRewindButton(boolean z7) {
        this.f4256q.i(this.f4218G, z7);
        l();
    }

    public void setShowShuffleButton(boolean z7) {
        this.f4256q.i(this.f4225K, z7);
        r();
    }

    public void setShowSubtitleButton(boolean z7) {
        this.f4256q.i(this.f4229M, z7);
    }

    public void setShowTimeoutMs(int i7) {
        this.f4216E0 = i7;
        if (h()) {
            this.f4256q.h();
        }
    }

    public void setShowVrButton(boolean z7) {
        this.f4256q.i(this.f4227L, z7);
    }

    public void setTimeBarMinUpdateInterval(int i7) {
        this.f4217F0 = Z2.H.j(i7, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        boolean z7;
        View view = this.f4227L;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            if (onClickListener != null) {
                z7 = true;
            } else {
                z7 = false;
            }
            k(view, z7);
        }
    }

    public final void t() {
        boolean z7;
        U u7;
        C0129k c0129k = this.f4270x;
        c0129k.getClass();
        c0129k.d = Collections.emptyList();
        C0129k c0129k2 = this.f4272y;
        c0129k2.getClass();
        c0129k2.d = Collections.emptyList();
        v0 v0Var = this.f4271x0;
        boolean z8 = false;
        ImageView imageView = this.f4229M;
        if (v0Var != null && ((P1.c) v0Var).n(30) && ((P1.c) this.f4271x0).n(29)) {
            L0 P6 = ((C0585B) this.f4271x0).P();
            U f = f(P6, 1);
            c0129k2.d = f;
            w wVar = c0129k2.f4185g;
            v0 v0Var2 = wVar.f4271x0;
            v0Var2.getClass();
            W2.h V6 = ((C0585B) v0Var2).V();
            boolean isEmpty = f.isEmpty();
            r rVar = wVar.f4266v;
            if (isEmpty) {
                rVar.f4195e[1] = wVar.getResources().getString(R.string.exo_track_selection_none);
            } else if (!c0129k2.k(V6)) {
                rVar.f4195e[1] = wVar.getResources().getString(R.string.exo_track_selection_auto);
            } else {
                int i7 = 0;
                while (true) {
                    if (i7 >= f.f2623t) {
                        break;
                    }
                    t tVar = (t) f.get(i7);
                    if (tVar.f4199a.f9694u[tVar.f4200b]) {
                        rVar.f4195e[1] = tVar.f4201c;
                        break;
                    }
                    i7++;
                }
            }
            if (this.f4256q.c(imageView)) {
                u7 = f(P6, 3);
            } else {
                u7 = U.f2621u;
            }
            c0129k.l(u7);
        }
        if (c0129k.a() > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        k(imageView, z7);
        r rVar2 = this.f4266v;
        if (rVar2.k(1) || rVar2.k(0)) {
            z8 = true;
        }
        k(this.f4233P, z8);
    }

    public void setProgressUpdateListener(p pVar) {
    }
}
