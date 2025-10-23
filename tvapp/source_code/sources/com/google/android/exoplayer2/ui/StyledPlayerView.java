package com.google.android.exoplayer2.ui;

import A.a;
import J3.e;
import O3.E;
import P1.c;
import X2.AbstractC0124f;
import X2.B;
import X2.C;
import X2.D;
import X2.InterfaceC0119a;
import X2.InterfaceC0131m;
import X2.v;
import X2.w;
import Z2.AbstractC0156a;
import Z2.H;
import Z2.InterfaceC0161f;
import a3.m;
import a3.z;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b3.k;
import com.boxhdo.android.tv.R;
import e2.C0585B;
import e2.C0616l;
import e2.v0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
@Deprecated
/* loaded from: classes.dex */
public class StyledPlayerView extends FrameLayout {

    /* renamed from: P  reason: collision with root package name */
    public static final /* synthetic */ int f8172P = 0;

    /* renamed from: A  reason: collision with root package name */
    public final FrameLayout f8173A;

    /* renamed from: B  reason: collision with root package name */
    public final FrameLayout f8174B;

    /* renamed from: C  reason: collision with root package name */
    public v0 f8175C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f8176D;

    /* renamed from: E  reason: collision with root package name */
    public v f8177E;
    public int F;

    /* renamed from: G  reason: collision with root package name */
    public Drawable f8178G;

    /* renamed from: H  reason: collision with root package name */
    public int f8179H;

    /* renamed from: I  reason: collision with root package name */
    public boolean f8180I;

    /* renamed from: J  reason: collision with root package name */
    public CharSequence f8181J;

    /* renamed from: K  reason: collision with root package name */
    public int f8182K;

    /* renamed from: L  reason: collision with root package name */
    public boolean f8183L;

    /* renamed from: M  reason: collision with root package name */
    public boolean f8184M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f8185N;

    /* renamed from: O  reason: collision with root package name */
    public int f8186O;

    /* renamed from: q  reason: collision with root package name */
    public final C f8187q;

    /* renamed from: r  reason: collision with root package name */
    public final AspectRatioFrameLayout f8188r;

    /* renamed from: s  reason: collision with root package name */
    public final View f8189s;

    /* renamed from: t  reason: collision with root package name */
    public final View f8190t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f8191u;

    /* renamed from: v  reason: collision with root package name */
    public final ImageView f8192v;

    /* renamed from: w  reason: collision with root package name */
    public final SubtitleView f8193w;

    /* renamed from: x  reason: collision with root package name */
    public final View f8194x;

    /* renamed from: y  reason: collision with root package name */
    public final TextView f8195y;

    /* renamed from: z  reason: collision with root package name */
    public final w f8196z;

    /* JADX WARN: Multi-variable type inference failed */
    public StyledPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i7;
        int i8;
        boolean z7;
        boolean z8;
        int i9;
        int i10;
        int i11;
        boolean z9;
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        boolean z12;
        int i14;
        int i15;
        boolean z13;
        int i16;
        int i17;
        boolean z14;
        C c5 = new C(this);
        this.f8187q = c5;
        if (isInEditMode()) {
            this.f8188r = null;
            this.f8189s = null;
            this.f8190t = null;
            this.f8191u = false;
            this.f8192v = null;
            this.f8193w = null;
            this.f8194x = null;
            this.f8195y = null;
            this.f8196z = null;
            this.f8173A = null;
            this.f8174B = null;
            ImageView imageView = new ImageView(context);
            if (H.f4603a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(H.s(context, resources, R.drawable.exo_edit_mode_logo));
                imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(H.s(context, resources2, R.drawable.exo_edit_mode_logo));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC0124f.d, 0, 0);
            try {
                z10 = obtainStyledAttributes.hasValue(28);
                i12 = obtainStyledAttributes.getColor(28, 0);
                int resourceId = obtainStyledAttributes.getResourceId(15, R.layout.exo_styled_player_view);
                z11 = obtainStyledAttributes.getBoolean(33, true);
                i13 = obtainStyledAttributes.getInt(3, 1);
                int resourceId2 = obtainStyledAttributes.getResourceId(9, 0);
                boolean z15 = obtainStyledAttributes.getBoolean(34, true);
                int i18 = obtainStyledAttributes.getInt(29, 1);
                int i19 = obtainStyledAttributes.getInt(17, 0);
                int i20 = obtainStyledAttributes.getInt(26, 5000);
                boolean z16 = obtainStyledAttributes.getBoolean(11, true);
                boolean z17 = obtainStyledAttributes.getBoolean(4, true);
                int integer = obtainStyledAttributes.getInteger(23, 0);
                this.f8180I = obtainStyledAttributes.getBoolean(12, this.f8180I);
                boolean z18 = obtainStyledAttributes.getBoolean(10, true);
                obtainStyledAttributes.recycle();
                z7 = z16;
                z9 = z17;
                z12 = z15;
                i7 = i20;
                i11 = resourceId2;
                i14 = resourceId;
                i10 = i18;
                i9 = i19;
                z8 = z18;
                i8 = integer;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i7 = 5000;
            i8 = 0;
            z7 = true;
            z8 = true;
            i9 = 0;
            i10 = 1;
            i11 = 0;
            z9 = true;
            i12 = 0;
            z10 = false;
            z11 = true;
            i13 = 1;
            z12 = true;
            i14 = R.layout.exo_styled_player_view;
        }
        LayoutInflater.from(context).inflate(i14, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.f8188r = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i9);
        }
        View findViewById = findViewById(R.id.exo_shutter);
        this.f8189s = findViewById;
        if (findViewById != null && z10) {
            findViewById.setBackgroundColor(i12);
        }
        if (aspectRatioFrameLayout != null && i10 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        this.f8190t = new SurfaceView(context);
                    } else {
                        try {
                            int i21 = m.f5098r;
                            this.f8190t = (View) m.class.getConstructor(Context.class).newInstance(context);
                        } catch (Exception e3) {
                            throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e3);
                        }
                    }
                } else {
                    try {
                        int i22 = k.f7109B;
                        this.f8190t = (View) k.class.getConstructor(Context.class).newInstance(context);
                        z13 = true;
                        this.f8190t.setLayoutParams(layoutParams);
                        this.f8190t.setOnClickListener(c5);
                        i15 = 0;
                        this.f8190t.setClickable(false);
                        aspectRatioFrameLayout.addView(this.f8190t, 0);
                    } catch (Exception e7) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e7);
                    }
                }
            } else {
                this.f8190t = new TextureView(context);
            }
            z13 = false;
            this.f8190t.setLayoutParams(layoutParams);
            this.f8190t.setOnClickListener(c5);
            i15 = 0;
            this.f8190t.setClickable(false);
            aspectRatioFrameLayout.addView(this.f8190t, 0);
        } else {
            i15 = 0;
            this.f8190t = null;
            z13 = false;
        }
        this.f8191u = z13;
        this.f8173A = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.f8174B = (FrameLayout) findViewById(R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f8192v = imageView2;
        if (z11 && i13 != 0 && imageView2 != null) {
            i16 = i13;
        } else {
            i16 = i15;
        }
        this.F = i16;
        if (i11 != 0) {
            this.f8178G = a.b(getContext(), i11);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.f8193w = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View findViewById2 = findViewById(R.id.exo_buffering);
        this.f8194x = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.f8179H = i8;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.f8195y = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        w wVar = (w) findViewById(R.id.exo_controller);
        View findViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (wVar != null) {
            this.f8196z = wVar;
        } else if (findViewById3 != null) {
            w wVar2 = new w(context, attributeSet);
            this.f8196z = wVar2;
            wVar2.setId(R.id.exo_controller);
            wVar2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(wVar2, indexOfChild);
        } else {
            this.f8196z = null;
        }
        w wVar3 = this.f8196z;
        if (wVar3 != null) {
            i17 = i7;
        } else {
            i17 = i15;
        }
        this.f8182K = i17;
        this.f8185N = z7;
        this.f8183L = z9;
        this.f8184M = z8;
        if (z12 && wVar3 != null) {
            z14 = 1;
        } else {
            z14 = i15;
        }
        this.f8176D = z14;
        if (wVar3 != null) {
            B b7 = wVar3.f4256q;
            int i23 = b7.f4110z;
            if (i23 != 3 && i23 != 2) {
                b7.g();
                b7.j(2);
            }
            this.f8196z.f4262t.add(c5);
        }
        if (z12) {
            setClickable(true);
        }
        k();
    }

    public static void a(TextureView textureView, int i7) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i7 != 0) {
            float f = width / 2.0f;
            float f7 = height / 2.0f;
            matrix.postRotate(i7, f, f7);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f7);
        }
        textureView.setTransform(matrix);
    }

    public final boolean b() {
        w wVar = this.f8196z;
        return wVar != null && wVar.h();
    }

    public final boolean c() {
        v0 v0Var = this.f8175C;
        return v0Var != null && ((c) v0Var).n(16) && ((C0585B) this.f8175C).W() && ((C0585B) this.f8175C).S();
    }

    public final void d(boolean z7) {
        if (!(c() && this.f8184M) && n()) {
            w wVar = this.f8196z;
            boolean z8 = wVar.h() && wVar.getShowTimeoutMs() <= 0;
            boolean f = f();
            if (z7 || z8 || f) {
                g(f);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z7;
        v0 v0Var = this.f8175C;
        if (v0Var != null && ((c) v0Var).n(16) && ((C0585B) this.f8175C).W()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 19 && keyCode != 270 && keyCode != 22 && keyCode != 271 && keyCode != 20 && keyCode != 269 && keyCode != 21 && keyCode != 268 && keyCode != 23) {
            z7 = false;
        } else {
            z7 = true;
        }
        w wVar = this.f8196z;
        if ((z7 && n() && !wVar.h()) || ((n() && wVar.d(keyEvent)) || super.dispatchKeyEvent(keyEvent))) {
            d(true);
            return true;
        } else if (!z7 || !n()) {
            return false;
        } else {
            d(true);
            return false;
        }
    }

    public final boolean e(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.F == 2) {
                    f = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f8188r;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f);
                }
                ImageView imageView = this.f8192v;
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        v0 v0Var = this.f8175C;
        if (v0Var == null) {
            return true;
        }
        int T6 = ((C0585B) v0Var).T();
        if (this.f8183L && (!((c) this.f8175C).n(17) || !((C0585B) this.f8175C).O().q())) {
            if (T6 == 1 || T6 == 4) {
                return true;
            }
            v0 v0Var2 = this.f8175C;
            v0Var2.getClass();
            if (!((C0585B) v0Var2).S()) {
                return true;
            }
        }
        return false;
    }

    public final void g(boolean z7) {
        int i7;
        if (!n()) {
            return;
        }
        if (z7) {
            i7 = 0;
        } else {
            i7 = this.f8182K;
        }
        w wVar = this.f8196z;
        wVar.setShowTimeoutMs(i7);
        B b7 = wVar.f4256q;
        w wVar2 = b7.f4088a;
        if (!wVar2.i()) {
            wVar2.setVisibility(0);
            wVar2.j();
            View view = wVar2.f4215E;
            if (view != null) {
                view.requestFocus();
            }
        }
        b7.l();
    }

    public List<e> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        if (this.f8174B != null) {
            arrayList.add(new e(12));
        }
        if (this.f8196z != null) {
            arrayList.add(new e(12));
        }
        return E.s(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.f8173A;
        AbstractC0156a.m(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public int getArtworkDisplayMode() {
        return this.F;
    }

    public boolean getControllerAutoShow() {
        return this.f8183L;
    }

    public boolean getControllerHideOnTouch() {
        return this.f8185N;
    }

    public int getControllerShowTimeoutMs() {
        return this.f8182K;
    }

    public Drawable getDefaultArtwork() {
        return this.f8178G;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f8174B;
    }

    public v0 getPlayer() {
        return this.f8175C;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f8188r;
        AbstractC0156a.l(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f8193w;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.F != 0;
    }

    public boolean getUseController() {
        return this.f8176D;
    }

    public View getVideoSurfaceView() {
        return this.f8190t;
    }

    public final void h() {
        if (!n() || this.f8175C == null) {
            return;
        }
        w wVar = this.f8196z;
        if (!wVar.h()) {
            d(true);
        } else if (this.f8185N) {
            wVar.g();
        }
    }

    public final void i() {
        z zVar;
        float f;
        v0 v0Var = this.f8175C;
        if (v0Var != null) {
            C0585B c0585b = (C0585B) v0Var;
            c0585b.q0();
            zVar = c0585b.f9468u0;
        } else {
            zVar = z.f5137u;
        }
        int i7 = zVar.f5138q;
        float f7 = 0.0f;
        int i8 = zVar.f5139r;
        if (i8 != 0 && i7 != 0) {
            f = (i7 * zVar.f5141t) / i8;
        } else {
            f = 0.0f;
        }
        View view = this.f8190t;
        if (view instanceof TextureView) {
            int i9 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            int i10 = zVar.f5140s;
            if (i9 > 0 && (i10 == 90 || i10 == 270)) {
                f = 1.0f / f;
            }
            int i11 = this.f8186O;
            C c5 = this.f8187q;
            if (i11 != 0) {
                view.removeOnLayoutChangeListener(c5);
            }
            this.f8186O = i10;
            if (i10 != 0) {
                view.addOnLayoutChangeListener(c5);
            }
            a((TextureView) view, this.f8186O);
        }
        if (!this.f8191u) {
            f7 = f;
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f8188r;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (((e2.C0585B) r5.f8175C).S() == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            r5 = this;
            android.view.View r0 = r5.f8194x
            if (r0 == 0) goto L2d
            e2.v0 r1 = r5.f8175C
            r2 = 0
            if (r1 == 0) goto L24
            e2.B r1 = (e2.C0585B) r1
            int r1 = r1.T()
            r3 = 2
            if (r1 != r3) goto L24
            int r1 = r5.f8179H
            r4 = 1
            if (r1 == r3) goto L25
            if (r1 != r4) goto L24
            e2.v0 r1 = r5.f8175C
            e2.B r1 = (e2.C0585B) r1
            boolean r1 = r1.S()
            if (r1 == 0) goto L24
            goto L25
        L24:
            r4 = r2
        L25:
            if (r4 == 0) goto L28
            goto L2a
        L28:
            r2 = 8
        L2a:
            r0.setVisibility(r2)
        L2d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.StyledPlayerView.j():void");
    }

    public final void k() {
        Resources resources;
        int i7;
        String str = null;
        w wVar = this.f8196z;
        if (wVar != null && this.f8176D) {
            if (!wVar.h()) {
                resources = getResources();
                i7 = R.string.exo_controls_show;
            } else if (this.f8185N) {
                resources = getResources();
                i7 = R.string.exo_controls_hide;
            }
            str = resources.getString(i7);
        }
        setContentDescription(str);
    }

    public final void l() {
        TextView textView = this.f8195y;
        if (textView != null) {
            CharSequence charSequence = this.f8181J;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                return;
            }
            v0 v0Var = this.f8175C;
            if (v0Var != null) {
                C0585B c0585b = (C0585B) v0Var;
                c0585b.q0();
                C0616l c0616l = c0585b.f9472w0.f;
            }
            textView.setVisibility(8);
        }
    }

    public final void m(boolean z7) {
        v0 v0Var = this.f8175C;
        View view = this.f8189s;
        ImageView imageView = this.f8192v;
        if (v0Var != null) {
            c cVar = (c) v0Var;
            if (cVar.n(30)) {
                C0585B c0585b = (C0585B) v0Var;
                if (!c0585b.P().f9701q.isEmpty()) {
                    if (z7 && !this.f8180I && view != null) {
                        view.setVisibility(0);
                    }
                    if (c0585b.P().b(2)) {
                        if (imageView != null) {
                            imageView.setImageResource(17170445);
                            imageView.setVisibility(4);
                            return;
                        }
                        return;
                    }
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    if (this.F != 0) {
                        AbstractC0156a.l(imageView);
                        if (cVar.n(18)) {
                            C0585B c0585b2 = (C0585B) cVar;
                            c0585b2.q0();
                            byte[] bArr = c0585b2.f9447d0.f9908z;
                            if (bArr != null) {
                                if (e(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)))) {
                                    return;
                                }
                            }
                        }
                        if (e(this.f8178G)) {
                            return;
                        }
                    }
                    if (imageView != null) {
                        imageView.setImageResource(17170445);
                        imageView.setVisibility(4);
                        return;
                    }
                    return;
                }
            }
        }
        if (!this.f8180I) {
            if (imageView != null) {
                imageView.setImageResource(17170445);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public final boolean n() {
        if (this.f8176D) {
            AbstractC0156a.l(this.f8196z);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!n() || this.f8175C == null) {
            return false;
        }
        d(true);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        h();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i7) {
        AbstractC0156a.k(i7 == 0 || this.f8192v != null);
        if (this.F != i7) {
            this.F = i7;
            m(false);
        }
    }

    public void setAspectRatioListener(InterfaceC0119a interfaceC0119a) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f8188r;
        AbstractC0156a.l(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(interfaceC0119a);
    }

    public void setControllerAutoShow(boolean z7) {
        this.f8183L = z7;
    }

    public void setControllerHideDuringAds(boolean z7) {
        this.f8184M = z7;
    }

    public void setControllerHideOnTouch(boolean z7) {
        AbstractC0156a.l(this.f8196z);
        this.f8185N = z7;
        k();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(InterfaceC0131m interfaceC0131m) {
        w wVar = this.f8196z;
        AbstractC0156a.l(wVar);
        wVar.setOnFullScreenModeChangedListener(interfaceC0131m);
    }

    public void setControllerShowTimeoutMs(int i7) {
        w wVar = this.f8196z;
        AbstractC0156a.l(wVar);
        this.f8182K = i7;
        if (wVar.h()) {
            g(f());
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(v vVar) {
        w wVar = this.f8196z;
        AbstractC0156a.l(wVar);
        v vVar2 = this.f8177E;
        if (vVar2 == vVar) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = wVar.f4262t;
        if (vVar2 != null) {
            copyOnWriteArrayList.remove(vVar2);
        }
        this.f8177E = vVar;
        if (vVar != null) {
            copyOnWriteArrayList.add(vVar);
            setControllerVisibilityListener((D) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        AbstractC0156a.k(this.f8195y != null);
        this.f8181J = charSequence;
        l();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f8178G != drawable) {
            this.f8178G = drawable;
            m(false);
        }
    }

    public void setErrorMessageProvider(InterfaceC0161f interfaceC0161f) {
        if (interfaceC0161f != null) {
            l();
        }
    }

    public void setFullscreenButtonClickListener(X2.E e3) {
        w wVar = this.f8196z;
        AbstractC0156a.l(wVar);
        wVar.setOnFullScreenModeChangedListener(this.f8187q);
    }

    public void setKeepContentOnPlayerReset(boolean z7) {
        if (this.f8180I != z7) {
            this.f8180I = z7;
            m(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setPlayer(e2.v0 r12) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.StyledPlayerView.setPlayer(e2.v0):void");
    }

    public void setRepeatToggleModes(int i7) {
        w wVar = this.f8196z;
        AbstractC0156a.l(wVar);
        wVar.setRepeatToggleModes(i7);
    }

    public void setResizeMode(int i7) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f8188r;
        AbstractC0156a.l(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i7);
    }

    public void setShowBuffering(int i7) {
        if (this.f8179H != i7) {
            this.f8179H = i7;
            j();
        }
    }

    public void setShowFastForwardButton(boolean z7) {
        w wVar = this.f8196z;
        AbstractC0156a.l(wVar);
        wVar.setShowFastForwardButton(z7);
    }

    public void setShowMultiWindowTimeBar(boolean z7) {
        w wVar = this.f8196z;
        AbstractC0156a.l(wVar);
        wVar.setShowMultiWindowTimeBar(z7);
    }

    public void setShowNextButton(boolean z7) {
        w wVar = this.f8196z;
        AbstractC0156a.l(wVar);
        wVar.setShowNextButton(z7);
    }

    public void setShowPreviousButton(boolean z7) {
        w wVar = this.f8196z;
        AbstractC0156a.l(wVar);
        wVar.setShowPreviousButton(z7);
    }

    public void setShowRewindButton(boolean z7) {
        w wVar = this.f8196z;
        AbstractC0156a.l(wVar);
        wVar.setShowRewindButton(z7);
    }

    public void setShowShuffleButton(boolean z7) {
        w wVar = this.f8196z;
        AbstractC0156a.l(wVar);
        wVar.setShowShuffleButton(z7);
    }

    public void setShowSubtitleButton(boolean z7) {
        w wVar = this.f8196z;
        AbstractC0156a.l(wVar);
        wVar.setShowSubtitleButton(z7);
    }

    public void setShowVrButton(boolean z7) {
        w wVar = this.f8196z;
        AbstractC0156a.l(wVar);
        wVar.setShowVrButton(z7);
    }

    public void setShutterBackgroundColor(int i7) {
        View view = this.f8189s;
        if (view != null) {
            view.setBackgroundColor(i7);
        }
    }

    @Deprecated
    public void setUseArtwork(boolean z7) {
        setArtworkDisplayMode(!z7 ? 1 : 0);
    }

    public void setUseController(boolean z7) {
        v0 v0Var;
        boolean z8 = true;
        w wVar = this.f8196z;
        AbstractC0156a.k((z7 && wVar == null) ? false : true);
        if (!z7 && !hasOnClickListeners()) {
            z8 = false;
        }
        setClickable(z8);
        if (this.f8176D == z7) {
            return;
        }
        this.f8176D = z7;
        if (!n()) {
            if (wVar != null) {
                wVar.g();
                v0Var = null;
            }
            k();
        }
        v0Var = this.f8175C;
        wVar.setPlayer(v0Var);
        k();
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        View view = this.f8190t;
        if (view instanceof SurfaceView) {
            view.setVisibility(i7);
        }
    }

    public void setControllerVisibilityListener(D d) {
        if (d != null) {
            setControllerVisibilityListener((v) null);
        }
    }
}
