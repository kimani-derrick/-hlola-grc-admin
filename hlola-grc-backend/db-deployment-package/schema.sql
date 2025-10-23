--
-- PostgreSQL database dump
--

\restrict RyImxgg5LkHOXgCxqZc1SWCBtrBJVQfszTWsSWuDiBhWuvBNWSPb3fQcBDaQrjO

-- Dumped from database version 15.14
-- Dumped by pg_dump version 15.14

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: uuid-ossp; Type: EXTENSION; Schema: -; Owner: -
--

CREATE EXTENSION IF NOT EXISTS "uuid-ossp" WITH SCHEMA public;


--
-- Name: EXTENSION "uuid-ossp"; Type: COMMENT; Schema: -; Owner: -
--

COMMENT ON EXTENSION "uuid-ossp" IS 'generate universally unique identifiers (UUIDs)';


SET default_table_access_method = heap;

--
-- Name: audit_findings; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.audit_findings (
    id uuid DEFAULT gen_random_uuid() NOT NULL,
    audit_id uuid,
    control_id uuid,
    finding_type character varying(50) NOT NULL,
    severity character varying(20) NOT NULL,
    title character varying(500) NOT NULL,
    description text,
    evidence text,
    recommendation text,
    status character varying(50) DEFAULT 'open'::character varying,
    assigned_to uuid,
    due_date date,
    resolved_at timestamp without time zone,
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT chk_audit_findings_finding_type CHECK (((finding_type)::text = ANY ((ARRAY['observation'::character varying, 'non-conformity'::character varying, 'opportunity'::character varying])::text[]))),
    CONSTRAINT chk_audit_findings_severity CHECK (((severity)::text = ANY ((ARRAY['critical'::character varying, 'high'::character varying, 'medium'::character varying, 'low'::character varying, 'info'::character varying])::text[]))),
    CONSTRAINT chk_audit_findings_status CHECK (((status)::text = ANY ((ARRAY['open'::character varying, 'in-progress'::character varying, 'resolved'::character varying, 'closed'::character varying])::text[])))
);


--
-- Name: TABLE audit_findings; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON TABLE public.audit_findings IS 'Detailed audit findings and observations linked to audits';


--
-- Name: COLUMN audit_findings.finding_type; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.audit_findings.finding_type IS 'Type of finding: observation, non-conformity, or opportunity';


--
-- Name: COLUMN audit_findings.severity; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.audit_findings.severity IS 'Severity level: critical, high, medium, low, info';


--
-- Name: COLUMN audit_findings.evidence; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.audit_findings.evidence IS 'Evidence supporting the finding';


--
-- Name: COLUMN audit_findings.recommendation; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.audit_findings.recommendation IS 'Recommended action to address the finding';


--
-- Name: COLUMN audit_findings.status; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.audit_findings.status IS 'Status of the finding: open, in-progress, resolved, closed';


--
-- Name: audit_gaps; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.audit_gaps (
    id uuid DEFAULT gen_random_uuid() NOT NULL,
    entity_id uuid,
    framework_id uuid,
    control_id uuid,
    title character varying(500) NOT NULL,
    description text,
    category character varying(100),
    severity character varying(20) NOT NULL,
    status character varying(50) DEFAULT 'open'::character varying,
    impact_description text,
    remediation_plan text,
    estimated_effort character varying(100),
    assigned_to uuid,
    assigned_team character varying(100),
    due_date date,
    resolved_at timestamp without time zone,
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);


--
-- Name: audit_packages; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.audit_packages (
    id uuid DEFAULT gen_random_uuid() NOT NULL,
    entity_id uuid,
    framework_id uuid,
    audit_readiness_score integer DEFAULT 0,
    last_audit_date date,
    next_audit_date date,
    certification_status character varying(50),
    certification_expiry date,
    regulatory_requirements jsonb,
    requirement_status jsonb,
    requirement_evidence jsonb,
    requirement_notes jsonb,
    strengths text[],
    recommendations text[],
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);


--
-- Name: audit_timeline; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.audit_timeline (
    id uuid DEFAULT gen_random_uuid() NOT NULL,
    entity_id uuid,
    framework_id uuid,
    event_type character varying(50) NOT NULL,
    event_date date NOT NULL,
    event_title character varying(500) NOT NULL,
    description text,
    status character varying(50) DEFAULT 'completed'::character varying,
    related_documents text[],
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);


--
-- Name: audits; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.audits (
    id uuid DEFAULT gen_random_uuid() NOT NULL,
    entity_id uuid,
    framework_id uuid,
    audit_package_id uuid,
    title character varying(500) NOT NULL,
    description text,
    audit_type character varying(50) NOT NULL,
    status character varying(50) DEFAULT 'planning'::character varying,
    priority character varying(20) NOT NULL,
    auditor character varying(255),
    start_date date NOT NULL,
    end_date date NOT NULL,
    progress integer DEFAULT 0,
    next_milestone character varying(500),
    estimated_completion date,
    created_by uuid,
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT chk_audits_audit_type CHECK (((audit_type)::text = ANY ((ARRAY['regulatory'::character varying, 'certification'::character varying, 'internal'::character varying])::text[]))),
    CONSTRAINT chk_audits_dates CHECK ((end_date >= start_date)),
    CONSTRAINT chk_audits_priority CHECK (((priority)::text = ANY ((ARRAY['critical'::character varying, 'high'::character varying, 'medium'::character varying, 'low'::character varying])::text[]))),
    CONSTRAINT chk_audits_progress CHECK (((progress >= 0) AND (progress <= 100))),
    CONSTRAINT chk_audits_status CHECK (((status)::text = ANY ((ARRAY['planning'::character varying, 'in-progress'::character varying, 'completed'::character varying, 'overdue'::character varying, 'cancelled'::character varying])::text[])))
);


--
-- Name: TABLE audits; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON TABLE public.audits IS 'Main audit records with comprehensive audit management data';


--
-- Name: COLUMN audits.audit_type; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.audits.audit_type IS 'Type of audit: regulatory, certification, or internal';


--
-- Name: COLUMN audits.status; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.audits.status IS 'Current status of the audit: planning, in-progress, completed, overdue, cancelled';


--
-- Name: COLUMN audits.priority; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.audits.priority IS 'Priority level: critical, high, medium, low';


--
-- Name: COLUMN audits.auditor; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.audits.auditor IS 'Name or organization of the auditor conducting the audit';


--
-- Name: COLUMN audits.progress; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.audits.progress IS 'Completion percentage from 0 to 100';


--
-- Name: comments; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.comments (
    id uuid DEFAULT gen_random_uuid() NOT NULL,
    entity_id uuid,
    task_id uuid,
    control_id uuid,
    framework_id uuid,
    parent_comment_id uuid,
    author_id uuid,
    content text NOT NULL,
    comment_type character varying(50) DEFAULT 'general'::character varying,
    is_internal boolean DEFAULT false,
    is_resolved boolean DEFAULT false,
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    is_active boolean DEFAULT true,
    CONSTRAINT chk_comments_content CHECK ((length(TRIM(BOTH FROM content)) > 0)),
    CONSTRAINT chk_comments_entity_task CHECK (((entity_id IS NOT NULL) OR (task_id IS NOT NULL) OR (control_id IS NOT NULL) OR (framework_id IS NOT NULL))),
    CONSTRAINT chk_comments_type CHECK (((comment_type)::text = ANY ((ARRAY['general'::character varying, 'update'::character varying, 'question'::character varying, 'resolution'::character varying, 'note'::character varying])::text[])))
);


--
-- Name: TABLE comments; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON TABLE public.comments IS 'Comments and updates for tasks, controls, frameworks, and entities';


--
-- Name: COLUMN comments.parent_comment_id; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.comments.parent_comment_id IS 'Reference to parent comment for threaded discussions';


--
-- Name: COLUMN comments.content; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.comments.content IS 'The actual comment text content';


--
-- Name: COLUMN comments.comment_type; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.comments.comment_type IS 'Type of comment: general, update, question, resolution, note';


--
-- Name: COLUMN comments.is_internal; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.comments.is_internal IS 'Whether comment is internal (not visible to external auditors)';


--
-- Name: COLUMN comments.is_resolved; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.comments.is_resolved IS 'Whether a question-type comment has been resolved';


--
-- Name: compliance_history; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.compliance_history (
    id uuid DEFAULT gen_random_uuid() NOT NULL,
    entity_id uuid,
    framework_id uuid,
    compliance_score integer NOT NULL,
    milestone character varying(255),
    event_type character varying(50),
    event_date date NOT NULL,
    description text,
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);


--
-- Name: compliance_insights; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.compliance_insights (
    id uuid DEFAULT gen_random_uuid() NOT NULL,
    entity_id uuid,
    insight_type character varying(50) NOT NULL,
    title character varying(500) NOT NULL,
    description text NOT NULL,
    recommendation text,
    affected_items text[],
    priority character varying(20) DEFAULT 'medium'::character varying,
    is_active boolean DEFAULT true,
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);


--
-- Name: control_assignments; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.control_assignments (
    id uuid DEFAULT gen_random_uuid() NOT NULL,
    entity_id uuid,
    control_id uuid,
    assigned_to uuid,
    assigned_team character varying(100),
    status character varying(50) DEFAULT 'not-started'::character varying,
    completion_rate integer DEFAULT 0,
    priority character varying(20) DEFAULT 'medium'::character varying,
    due_date date,
    started_at timestamp without time zone,
    completed_at timestamp without time zone,
    last_reviewed_at timestamp without time zone,
    review_notes text,
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);


--
-- Name: controls; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.controls (
    id uuid DEFAULT gen_random_uuid() NOT NULL,
    framework_id uuid,
    control_id character varying(100) NOT NULL,
    title character varying(500) NOT NULL,
    description text,
    category character varying(100),
    subcategory character varying(100),
    priority character varying(20) NOT NULL,
    implementation_level character varying(50),
    business_impact text,
    technical_requirements text,
    legal_requirements text,
    implementation_guidance text,
    testing_procedures text,
    evidence_requirements text[],
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    is_active boolean DEFAULT true
);


--
-- Name: documents; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.documents (
    id uuid DEFAULT gen_random_uuid() NOT NULL,
    entity_id uuid,
    framework_id uuid,
    control_id uuid,
    task_id uuid,
    name character varying(500) NOT NULL,
    description text,
    document_type character varying(100),
    file_path character varying(1000),
    file_size bigint,
    mime_type character varying(100),
    version character varying(50),
    status character varying(50) DEFAULT 'draft'::character varying,
    is_evidence boolean DEFAULT false,
    uploaded_by uuid,
    reviewed_by uuid,
    reviewed_at timestamp without time zone,
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);


--
-- Name: entities; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.entities (
    id uuid DEFAULT gen_random_uuid() NOT NULL,
    organization_id uuid,
    name character varying(255) NOT NULL,
    description text,
    entity_type character varying(50) NOT NULL,
    country character varying(100),
    region character varying(100),
    industry character varying(100),
    size character varying(50),
    risk_level character varying(20) DEFAULT 'medium'::character varying,
    compliance_officer character varying(255),
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    is_active boolean DEFAULT true
);


--
-- Name: entity_frameworks; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.entity_frameworks (
    id uuid DEFAULT gen_random_uuid() NOT NULL,
    entity_id uuid,
    framework_id uuid,
    compliance_score integer DEFAULT 0,
    audit_readiness_score integer DEFAULT 0,
    last_audit_date date,
    next_audit_date date,
    certification_status character varying(50),
    certification_expiry date,
    compliance_deadline date,
    is_active boolean DEFAULT true,
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);


--
-- Name: tasks; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.tasks (
    id uuid DEFAULT gen_random_uuid() NOT NULL,
    control_id uuid,
    title character varying(500) NOT NULL,
    description text,
    status character varying(50) DEFAULT 'pending'::character varying,
    priority character varying(20) DEFAULT 'medium'::character varying,
    category character varying(100),
    assignee_id uuid,
    due_date date,
    completed_date date,
    estimated_hours integer,
    actual_hours integer,
    progress integer DEFAULT 0,
    evidence_attached boolean DEFAULT false,
    blockers text[],
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    auto_generated boolean DEFAULT false NOT NULL
);


--
-- Name: COLUMN tasks.auto_generated; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.tasks.auto_generated IS 'Indicates if the task was automatically generated by the compliance engine';


--
-- Name: dashboard_stats; Type: VIEW; Schema: public; Owner: -
--

CREATE VIEW public.dashboard_stats AS
 SELECT e.id AS entity_id,
    e.name AS entity_name,
    count(DISTINCT ef.framework_id) AS active_frameworks,
    round(avg(ef.compliance_score), 2) AS avg_compliance_score,
    count(DISTINCT ca.control_id) AS total_controls,
    count(
        CASE
            WHEN ((ca.status)::text = 'completed'::text) THEN 1
            ELSE NULL::integer
        END) AS completed_controls,
    count(DISTINCT t.id) AS total_tasks,
    count(
        CASE
            WHEN ((t.status)::text = 'completed'::text) THEN 1
            ELSE NULL::integer
        END) AS completed_tasks,
    count(
        CASE
            WHEN ((t.due_date < CURRENT_DATE) AND ((t.status)::text <> 'completed'::text)) THEN 1
            ELSE NULL::integer
        END) AS overdue_tasks,
    count(
        CASE
            WHEN (d.is_evidence = true) THEN 1
            ELSE NULL::integer
        END) AS evidence_items,
    count(
        CASE
            WHEN ((ag.status)::text = 'open'::text) THEN 1
            ELSE NULL::integer
        END) AS open_gaps,
    count(
        CASE
            WHEN (((ag.severity)::text = 'critical'::text) AND ((ag.status)::text = 'open'::text)) THEN 1
            ELSE NULL::integer
        END) AS critical_gaps
   FROM (((((public.entities e
     LEFT JOIN public.entity_frameworks ef ON (((e.id = ef.entity_id) AND (ef.is_active = true))))
     LEFT JOIN public.control_assignments ca ON ((e.id = ca.entity_id)))
     LEFT JOIN public.tasks t ON ((ca.control_id = t.control_id)))
     LEFT JOIN public.documents d ON ((e.id = d.entity_id)))
     LEFT JOIN public.audit_gaps ag ON ((e.id = ag.entity_id)))
  GROUP BY e.id, e.name;


--
-- Name: database_status; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.database_status (
    id integer NOT NULL,
    status character varying(50) DEFAULT 'initialized'::character varying,
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);


--
-- Name: database_status_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE public.database_status_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- Name: database_status_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE public.database_status_id_seq OWNED BY public.database_status.id;


--
-- Name: export_options; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.export_options (
    id uuid DEFAULT gen_random_uuid() NOT NULL,
    entity_id uuid,
    include_executive_summary boolean DEFAULT true,
    include_framework_details boolean DEFAULT true,
    include_control_matrices boolean DEFAULT true,
    include_evidence boolean DEFAULT false,
    include_gap_analysis boolean DEFAULT true,
    include_timeline boolean DEFAULT true,
    include_recommendations boolean DEFAULT true,
    format character varying(20) DEFAULT 'pdf'::character varying,
    frameworks text[],
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);


--
-- Name: framework_business_impacts; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.framework_business_impacts (
    id uuid DEFAULT gen_random_uuid() NOT NULL,
    framework_id uuid,
    penalty_amount character varying(50),
    penalty_currency character varying(10),
    business_benefits text[],
    market_access text[],
    competitive_advantage text[],
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);


--
-- Name: frameworks; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.frameworks (
    id uuid DEFAULT gen_random_uuid() NOT NULL,
    name character varying(255) NOT NULL,
    description text,
    region character varying(100) NOT NULL,
    country character varying(100),
    category character varying(50) NOT NULL,
    type character varying(50) NOT NULL,
    icon character varying(50),
    color character varying(20),
    compliance_deadline date,
    priority character varying(20) NOT NULL,
    risk_level character varying(20) NOT NULL,
    status character varying(20) DEFAULT 'draft'::character varying,
    requirements_count integer DEFAULT 0,
    applicable_countries text[],
    industry_scope character varying(100),
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    is_active boolean DEFAULT true,
    max_fine_amount numeric(15,2),
    max_fine_currency character varying(10) DEFAULT 'EUR'::character varying
);


--
-- Name: generated_reports; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.generated_reports (
    id uuid DEFAULT gen_random_uuid() NOT NULL,
    entity_id uuid,
    report_type character varying(100) NOT NULL,
    title character varying(500) NOT NULL,
    frameworks text[] NOT NULL,
    generated_date timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    page_count integer,
    includes_evidence boolean DEFAULT false,
    format character varying(20) DEFAULT 'pdf'::character varying,
    file_path character varying(1000),
    confidence_level character varying(20) DEFAULT 'medium'::character varying,
    summary text,
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);


--
-- Name: organizations; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.organizations (
    id uuid DEFAULT gen_random_uuid() NOT NULL,
    name character varying(255) NOT NULL,
    description text,
    industry character varying(100),
    size character varying(50),
    country character varying(100),
    region character varying(100),
    website character varying(255),
    logo_url character varying(500),
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    is_active boolean DEFAULT true
);


--
-- Name: platform_admins; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.platform_admins (
    id uuid DEFAULT gen_random_uuid() NOT NULL,
    email character varying(255) NOT NULL,
    password_hash character varying(255) NOT NULL,
    first_name character varying(100) NOT NULL,
    last_name character varying(100) NOT NULL,
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    is_active boolean DEFAULT true
);


--
-- Name: TABLE platform_admins; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON TABLE public.platform_admins IS 'Platform administrators who manage content library (frameworks, controls, tasks)';


--
-- Name: COLUMN platform_admins.email; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.platform_admins.email IS 'Unique email address for platform admin login';


--
-- Name: COLUMN platform_admins.password_hash; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.platform_admins.password_hash IS 'Bcrypt hashed password';


--
-- Name: COLUMN platform_admins.is_active; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.platform_admins.is_active IS 'Whether the admin account is active and can login';


--
-- Name: task_assignments; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.task_assignments (
    id uuid DEFAULT gen_random_uuid() NOT NULL,
    task_id uuid NOT NULL,
    entity_id uuid NOT NULL,
    assigned_to uuid,
    assigned_team character varying(255),
    status character varying(50) DEFAULT 'not-started'::character varying,
    priority character varying(20) DEFAULT 'medium'::character varying,
    due_date date,
    started_at timestamp without time zone,
    completed_at timestamp without time zone,
    last_reviewed_at timestamp without time zone,
    review_notes text,
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    progress integer DEFAULT 0,
    actual_hours integer DEFAULT 0,
    estimated_hours integer DEFAULT 0,
    evidence_attached boolean DEFAULT false,
    blockers text,
    CONSTRAINT task_assignments_actual_hours_check CHECK ((actual_hours >= 0)),
    CONSTRAINT task_assignments_estimated_hours_check CHECK ((estimated_hours >= 0)),
    CONSTRAINT task_assignments_progress_check CHECK (((progress >= 0) AND (progress <= 100)))
);


--
-- Name: TABLE task_assignments; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON TABLE public.task_assignments IS 'Links tasks to entities (similar to control_assignments). Tasks are org-independent.';


--
-- Name: COLUMN task_assignments.task_id; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.task_assignments.task_id IS 'Reference to the task (org-independent)';


--
-- Name: COLUMN task_assignments.entity_id; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.task_assignments.entity_id IS 'Reference to the entity (org-specific)';


--
-- Name: COLUMN task_assignments.assigned_to; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.task_assignments.assigned_to IS 'User assigned to this task for this entity';


--
-- Name: COLUMN task_assignments.status; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.task_assignments.status IS 'Status of this task assignment (not-started, in-progress, completed, etc.)';


--
-- Name: COLUMN task_assignments.progress; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.task_assignments.progress IS 'Progress percentage (0-100) for this task assignment';


--
-- Name: COLUMN task_assignments.actual_hours; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.task_assignments.actual_hours IS 'Actual hours worked on this task assignment';


--
-- Name: COLUMN task_assignments.estimated_hours; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.task_assignments.estimated_hours IS 'Estimated hours for this task assignment';


--
-- Name: COLUMN task_assignments.evidence_attached; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.task_assignments.evidence_attached IS 'Whether evidence has been attached to this task assignment';


--
-- Name: COLUMN task_assignments.blockers; Type: COMMENT; Schema: public; Owner: -
--

COMMENT ON COLUMN public.task_assignments.blockers IS 'Description of any blockers preventing completion of this task assignment';


--
-- Name: task_evidence; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.task_evidence (
    id uuid DEFAULT gen_random_uuid() NOT NULL,
    task_id uuid,
    document_id uuid,
    evidence_type character varying(100),
    description text,
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);


--
-- Name: team_performance; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.team_performance (
    id uuid DEFAULT gen_random_uuid() NOT NULL,
    entity_id uuid,
    team_name character varying(100) NOT NULL,
    period_start date NOT NULL,
    period_end date NOT NULL,
    assigned_tasks integer DEFAULT 0,
    completed_tasks integer DEFAULT 0,
    completion_rate integer DEFAULT 0,
    average_completion_time integer DEFAULT 0,
    overdue_items integer DEFAULT 0,
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);


--
-- Name: users; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.users (
    id uuid DEFAULT gen_random_uuid() NOT NULL,
    organization_id uuid,
    entity_id uuid,
    email character varying(255) NOT NULL,
    first_name character varying(100) NOT NULL,
    last_name character varying(100) NOT NULL,
    role character varying(50) NOT NULL,
    department character varying(100),
    job_title character varying(100),
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    is_active boolean DEFAULT true,
    password_hash character varying(255)
);


--
-- Name: database_status id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.database_status ALTER COLUMN id SET DEFAULT nextval('public.database_status_id_seq'::regclass);


--
-- Name: audit_findings audit_findings_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.audit_findings
    ADD CONSTRAINT audit_findings_pkey PRIMARY KEY (id);


--
-- Name: audit_gaps audit_gaps_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.audit_gaps
    ADD CONSTRAINT audit_gaps_pkey PRIMARY KEY (id);


--
-- Name: audit_packages audit_packages_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.audit_packages
    ADD CONSTRAINT audit_packages_pkey PRIMARY KEY (id);


--
-- Name: audit_timeline audit_timeline_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.audit_timeline
    ADD CONSTRAINT audit_timeline_pkey PRIMARY KEY (id);


--
-- Name: audits audits_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.audits
    ADD CONSTRAINT audits_pkey PRIMARY KEY (id);


--
-- Name: comments comments_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.comments
    ADD CONSTRAINT comments_pkey PRIMARY KEY (id);


--
-- Name: compliance_history compliance_history_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.compliance_history
    ADD CONSTRAINT compliance_history_pkey PRIMARY KEY (id);


--
-- Name: compliance_insights compliance_insights_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.compliance_insights
    ADD CONSTRAINT compliance_insights_pkey PRIMARY KEY (id);


--
-- Name: control_assignments control_assignments_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.control_assignments
    ADD CONSTRAINT control_assignments_pkey PRIMARY KEY (id);


--
-- Name: controls controls_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.controls
    ADD CONSTRAINT controls_pkey PRIMARY KEY (id);


--
-- Name: database_status database_status_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.database_status
    ADD CONSTRAINT database_status_pkey PRIMARY KEY (id);


--
-- Name: documents documents_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.documents
    ADD CONSTRAINT documents_pkey PRIMARY KEY (id);


--
-- Name: entities entities_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.entities
    ADD CONSTRAINT entities_pkey PRIMARY KEY (id);


--
-- Name: entity_frameworks entity_frameworks_entity_id_framework_id_key; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.entity_frameworks
    ADD CONSTRAINT entity_frameworks_entity_id_framework_id_key UNIQUE (entity_id, framework_id);


--
-- Name: entity_frameworks entity_frameworks_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.entity_frameworks
    ADD CONSTRAINT entity_frameworks_pkey PRIMARY KEY (id);


--
-- Name: export_options export_options_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.export_options
    ADD CONSTRAINT export_options_pkey PRIMARY KEY (id);


--
-- Name: framework_business_impacts framework_business_impacts_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.framework_business_impacts
    ADD CONSTRAINT framework_business_impacts_pkey PRIMARY KEY (id);


--
-- Name: frameworks frameworks_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.frameworks
    ADD CONSTRAINT frameworks_pkey PRIMARY KEY (id);


--
-- Name: generated_reports generated_reports_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.generated_reports
    ADD CONSTRAINT generated_reports_pkey PRIMARY KEY (id);


--
-- Name: organizations organizations_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.organizations
    ADD CONSTRAINT organizations_pkey PRIMARY KEY (id);


--
-- Name: platform_admins platform_admins_email_key; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.platform_admins
    ADD CONSTRAINT platform_admins_email_key UNIQUE (email);


--
-- Name: platform_admins platform_admins_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.platform_admins
    ADD CONSTRAINT platform_admins_pkey PRIMARY KEY (id);


--
-- Name: task_assignments task_assignments_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.task_assignments
    ADD CONSTRAINT task_assignments_pkey PRIMARY KEY (id);


--
-- Name: task_assignments task_assignments_task_id_entity_id_key; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.task_assignments
    ADD CONSTRAINT task_assignments_task_id_entity_id_key UNIQUE (task_id, entity_id);


--
-- Name: task_evidence task_evidence_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.task_evidence
    ADD CONSTRAINT task_evidence_pkey PRIMARY KEY (id);


--
-- Name: tasks tasks_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.tasks
    ADD CONSTRAINT tasks_pkey PRIMARY KEY (id);


--
-- Name: team_performance team_performance_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.team_performance
    ADD CONSTRAINT team_performance_pkey PRIMARY KEY (id);


--
-- Name: control_assignments unique_entity_control; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.control_assignments
    ADD CONSTRAINT unique_entity_control UNIQUE (entity_id, control_id);


--
-- Name: users users_email_key; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_email_key UNIQUE (email);


--
-- Name: users users_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);


--
-- Name: idx_audit_findings_assigned_to; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_audit_findings_assigned_to ON public.audit_findings USING btree (assigned_to);


--
-- Name: idx_audit_findings_audit; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_audit_findings_audit ON public.audit_findings USING btree (audit_id);


--
-- Name: idx_audit_findings_due_date; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_audit_findings_due_date ON public.audit_findings USING btree (due_date);


--
-- Name: idx_audit_findings_finding_type; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_audit_findings_finding_type ON public.audit_findings USING btree (finding_type);


--
-- Name: idx_audit_findings_severity; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_audit_findings_severity ON public.audit_findings USING btree (severity, status);


--
-- Name: idx_audit_gaps_entity; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_audit_gaps_entity ON public.audit_gaps USING btree (entity_id);


--
-- Name: idx_audit_gaps_severity; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_audit_gaps_severity ON public.audit_gaps USING btree (severity);


--
-- Name: idx_audit_gaps_status; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_audit_gaps_status ON public.audit_gaps USING btree (status);


--
-- Name: idx_audit_packages_entity; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_audit_packages_entity ON public.audit_packages USING btree (entity_id);


--
-- Name: idx_audit_timeline_entity; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_audit_timeline_entity ON public.audit_timeline USING btree (entity_id);


--
-- Name: idx_audits_audit_type; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_audits_audit_type ON public.audits USING btree (audit_type);


--
-- Name: idx_audits_created_by; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_audits_created_by ON public.audits USING btree (created_by);


--
-- Name: idx_audits_end_date; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_audits_end_date ON public.audits USING btree (end_date);


--
-- Name: idx_audits_entity_framework; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_audits_entity_framework ON public.audits USING btree (entity_id, framework_id);


--
-- Name: idx_audits_priority; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_audits_priority ON public.audits USING btree (priority);


--
-- Name: idx_audits_start_date; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_audits_start_date ON public.audits USING btree (start_date);


--
-- Name: idx_audits_status; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_audits_status ON public.audits USING btree (status);


--
-- Name: idx_comments_active; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_comments_active ON public.comments USING btree (is_active);


--
-- Name: idx_comments_author; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_comments_author ON public.comments USING btree (author_id);


--
-- Name: idx_comments_control; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_comments_control ON public.comments USING btree (control_id);


--
-- Name: idx_comments_created_at; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_comments_created_at ON public.comments USING btree (created_at);


--
-- Name: idx_comments_entity; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_comments_entity ON public.comments USING btree (entity_id);


--
-- Name: idx_comments_framework; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_comments_framework ON public.comments USING btree (framework_id);


--
-- Name: idx_comments_parent; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_comments_parent ON public.comments USING btree (parent_comment_id);


--
-- Name: idx_comments_task; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_comments_task ON public.comments USING btree (task_id);


--
-- Name: idx_comments_type; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_comments_type ON public.comments USING btree (comment_type);


--
-- Name: idx_compliance_history_entity; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_compliance_history_entity ON public.compliance_history USING btree (entity_id);


--
-- Name: idx_compliance_insights_entity; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_compliance_insights_entity ON public.compliance_insights USING btree (entity_id);


--
-- Name: idx_control_assignments_control; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_control_assignments_control ON public.control_assignments USING btree (control_id);


--
-- Name: idx_control_assignments_entity; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_control_assignments_entity ON public.control_assignments USING btree (entity_id);


--
-- Name: idx_control_assignments_user; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_control_assignments_user ON public.control_assignments USING btree (assigned_to);


--
-- Name: idx_controls_category; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_controls_category ON public.controls USING btree (category);


--
-- Name: idx_controls_framework; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_controls_framework ON public.controls USING btree (framework_id);


--
-- Name: idx_documents_entity; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_documents_entity ON public.documents USING btree (entity_id);


--
-- Name: idx_documents_evidence; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_documents_evidence ON public.documents USING btree (is_evidence);


--
-- Name: idx_documents_framework; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_documents_framework ON public.documents USING btree (framework_id);


--
-- Name: idx_entities_organization; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_entities_organization ON public.entities USING btree (organization_id);


--
-- Name: idx_entity_frameworks_entity; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_entity_frameworks_entity ON public.entity_frameworks USING btree (entity_id);


--
-- Name: idx_entity_frameworks_framework; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_entity_frameworks_framework ON public.entity_frameworks USING btree (framework_id);


--
-- Name: idx_frameworks_category; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_frameworks_category ON public.frameworks USING btree (category);


--
-- Name: idx_frameworks_region; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_frameworks_region ON public.frameworks USING btree (region);


--
-- Name: idx_frameworks_status; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_frameworks_status ON public.frameworks USING btree (status);


--
-- Name: idx_generated_reports_entity; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_generated_reports_entity ON public.generated_reports USING btree (entity_id);


--
-- Name: idx_organizations_name; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_organizations_name ON public.organizations USING btree (name);


--
-- Name: idx_platform_admins_email; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_platform_admins_email ON public.platform_admins USING btree (email);


--
-- Name: idx_platform_admins_is_active; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_platform_admins_is_active ON public.platform_admins USING btree (is_active);


--
-- Name: idx_task_assignments_assigned_to; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_task_assignments_assigned_to ON public.task_assignments USING btree (assigned_to);


--
-- Name: idx_task_assignments_entity_id; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_task_assignments_entity_id ON public.task_assignments USING btree (entity_id);


--
-- Name: idx_task_assignments_status; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_task_assignments_status ON public.task_assignments USING btree (status);


--
-- Name: idx_task_assignments_task_id; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_task_assignments_task_id ON public.task_assignments USING btree (task_id);


--
-- Name: idx_tasks_assignee; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_tasks_assignee ON public.tasks USING btree (assignee_id);


--
-- Name: idx_tasks_auto_generated; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_tasks_auto_generated ON public.tasks USING btree (auto_generated);


--
-- Name: idx_tasks_control; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_tasks_control ON public.tasks USING btree (control_id);


--
-- Name: idx_tasks_status; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_tasks_status ON public.tasks USING btree (status);


--
-- Name: idx_team_performance_entity; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_team_performance_entity ON public.team_performance USING btree (entity_id);


--
-- Name: idx_users_email; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_users_email ON public.users USING btree (email);


--
-- Name: idx_users_entity; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_users_entity ON public.users USING btree (entity_id);


--
-- Name: idx_users_organization; Type: INDEX; Schema: public; Owner: -
--

CREATE INDEX idx_users_organization ON public.users USING btree (organization_id);


--
-- Name: audit_findings audit_findings_assigned_to_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.audit_findings
    ADD CONSTRAINT audit_findings_assigned_to_fkey FOREIGN KEY (assigned_to) REFERENCES public.users(id) ON DELETE SET NULL;


--
-- Name: audit_findings audit_findings_audit_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.audit_findings
    ADD CONSTRAINT audit_findings_audit_id_fkey FOREIGN KEY (audit_id) REFERENCES public.audits(id) ON DELETE CASCADE;


--
-- Name: audit_findings audit_findings_control_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.audit_findings
    ADD CONSTRAINT audit_findings_control_id_fkey FOREIGN KEY (control_id) REFERENCES public.controls(id) ON DELETE SET NULL;


--
-- Name: audit_gaps audit_gaps_assigned_to_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.audit_gaps
    ADD CONSTRAINT audit_gaps_assigned_to_fkey FOREIGN KEY (assigned_to) REFERENCES public.users(id) ON DELETE SET NULL;


--
-- Name: audit_gaps audit_gaps_control_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.audit_gaps
    ADD CONSTRAINT audit_gaps_control_id_fkey FOREIGN KEY (control_id) REFERENCES public.controls(id) ON DELETE SET NULL;


--
-- Name: audit_gaps audit_gaps_entity_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.audit_gaps
    ADD CONSTRAINT audit_gaps_entity_id_fkey FOREIGN KEY (entity_id) REFERENCES public.entities(id) ON DELETE CASCADE;


--
-- Name: audit_gaps audit_gaps_framework_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.audit_gaps
    ADD CONSTRAINT audit_gaps_framework_id_fkey FOREIGN KEY (framework_id) REFERENCES public.frameworks(id) ON DELETE CASCADE;


--
-- Name: audit_packages audit_packages_entity_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.audit_packages
    ADD CONSTRAINT audit_packages_entity_id_fkey FOREIGN KEY (entity_id) REFERENCES public.entities(id) ON DELETE CASCADE;


--
-- Name: audit_packages audit_packages_framework_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.audit_packages
    ADD CONSTRAINT audit_packages_framework_id_fkey FOREIGN KEY (framework_id) REFERENCES public.frameworks(id) ON DELETE CASCADE;


--
-- Name: audit_timeline audit_timeline_entity_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.audit_timeline
    ADD CONSTRAINT audit_timeline_entity_id_fkey FOREIGN KEY (entity_id) REFERENCES public.entities(id) ON DELETE CASCADE;


--
-- Name: audit_timeline audit_timeline_framework_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.audit_timeline
    ADD CONSTRAINT audit_timeline_framework_id_fkey FOREIGN KEY (framework_id) REFERENCES public.frameworks(id) ON DELETE CASCADE;


--
-- Name: audits audits_audit_package_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.audits
    ADD CONSTRAINT audits_audit_package_id_fkey FOREIGN KEY (audit_package_id) REFERENCES public.audit_packages(id) ON DELETE SET NULL;


--
-- Name: audits audits_created_by_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.audits
    ADD CONSTRAINT audits_created_by_fkey FOREIGN KEY (created_by) REFERENCES public.users(id) ON DELETE SET NULL;


--
-- Name: audits audits_entity_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.audits
    ADD CONSTRAINT audits_entity_id_fkey FOREIGN KEY (entity_id) REFERENCES public.entities(id) ON DELETE CASCADE;


--
-- Name: audits audits_framework_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.audits
    ADD CONSTRAINT audits_framework_id_fkey FOREIGN KEY (framework_id) REFERENCES public.frameworks(id) ON DELETE CASCADE;


--
-- Name: comments comments_author_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.comments
    ADD CONSTRAINT comments_author_id_fkey FOREIGN KEY (author_id) REFERENCES public.users(id) ON DELETE SET NULL;


--
-- Name: comments comments_control_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.comments
    ADD CONSTRAINT comments_control_id_fkey FOREIGN KEY (control_id) REFERENCES public.controls(id) ON DELETE SET NULL;


--
-- Name: comments comments_entity_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.comments
    ADD CONSTRAINT comments_entity_id_fkey FOREIGN KEY (entity_id) REFERENCES public.entities(id) ON DELETE CASCADE;


--
-- Name: comments comments_framework_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.comments
    ADD CONSTRAINT comments_framework_id_fkey FOREIGN KEY (framework_id) REFERENCES public.frameworks(id) ON DELETE SET NULL;


--
-- Name: comments comments_parent_comment_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.comments
    ADD CONSTRAINT comments_parent_comment_id_fkey FOREIGN KEY (parent_comment_id) REFERENCES public.comments(id) ON DELETE CASCADE;


--
-- Name: comments comments_task_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.comments
    ADD CONSTRAINT comments_task_id_fkey FOREIGN KEY (task_id) REFERENCES public.tasks(id) ON DELETE CASCADE;


--
-- Name: compliance_history compliance_history_entity_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.compliance_history
    ADD CONSTRAINT compliance_history_entity_id_fkey FOREIGN KEY (entity_id) REFERENCES public.entities(id) ON DELETE CASCADE;


--
-- Name: compliance_history compliance_history_framework_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.compliance_history
    ADD CONSTRAINT compliance_history_framework_id_fkey FOREIGN KEY (framework_id) REFERENCES public.frameworks(id) ON DELETE CASCADE;


--
-- Name: compliance_insights compliance_insights_entity_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.compliance_insights
    ADD CONSTRAINT compliance_insights_entity_id_fkey FOREIGN KEY (entity_id) REFERENCES public.entities(id) ON DELETE CASCADE;


--
-- Name: control_assignments control_assignments_assigned_to_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.control_assignments
    ADD CONSTRAINT control_assignments_assigned_to_fkey FOREIGN KEY (assigned_to) REFERENCES public.users(id) ON DELETE SET NULL;


--
-- Name: control_assignments control_assignments_control_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.control_assignments
    ADD CONSTRAINT control_assignments_control_id_fkey FOREIGN KEY (control_id) REFERENCES public.controls(id) ON DELETE CASCADE;


--
-- Name: control_assignments control_assignments_entity_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.control_assignments
    ADD CONSTRAINT control_assignments_entity_id_fkey FOREIGN KEY (entity_id) REFERENCES public.entities(id) ON DELETE CASCADE;


--
-- Name: controls controls_framework_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.controls
    ADD CONSTRAINT controls_framework_id_fkey FOREIGN KEY (framework_id) REFERENCES public.frameworks(id) ON DELETE CASCADE;


--
-- Name: documents documents_control_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.documents
    ADD CONSTRAINT documents_control_id_fkey FOREIGN KEY (control_id) REFERENCES public.controls(id) ON DELETE SET NULL;


--
-- Name: documents documents_entity_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.documents
    ADD CONSTRAINT documents_entity_id_fkey FOREIGN KEY (entity_id) REFERENCES public.entities(id) ON DELETE CASCADE;


--
-- Name: documents documents_framework_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.documents
    ADD CONSTRAINT documents_framework_id_fkey FOREIGN KEY (framework_id) REFERENCES public.frameworks(id) ON DELETE SET NULL;


--
-- Name: documents documents_reviewed_by_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.documents
    ADD CONSTRAINT documents_reviewed_by_fkey FOREIGN KEY (reviewed_by) REFERENCES public.users(id) ON DELETE SET NULL;


--
-- Name: documents documents_task_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.documents
    ADD CONSTRAINT documents_task_id_fkey FOREIGN KEY (task_id) REFERENCES public.tasks(id) ON DELETE SET NULL;


--
-- Name: documents documents_uploaded_by_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.documents
    ADD CONSTRAINT documents_uploaded_by_fkey FOREIGN KEY (uploaded_by) REFERENCES public.users(id) ON DELETE SET NULL;


--
-- Name: entities entities_organization_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.entities
    ADD CONSTRAINT entities_organization_id_fkey FOREIGN KEY (organization_id) REFERENCES public.organizations(id) ON DELETE CASCADE;


--
-- Name: entity_frameworks entity_frameworks_entity_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.entity_frameworks
    ADD CONSTRAINT entity_frameworks_entity_id_fkey FOREIGN KEY (entity_id) REFERENCES public.entities(id) ON DELETE CASCADE;


--
-- Name: entity_frameworks entity_frameworks_framework_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.entity_frameworks
    ADD CONSTRAINT entity_frameworks_framework_id_fkey FOREIGN KEY (framework_id) REFERENCES public.frameworks(id) ON DELETE CASCADE;


--
-- Name: export_options export_options_entity_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.export_options
    ADD CONSTRAINT export_options_entity_id_fkey FOREIGN KEY (entity_id) REFERENCES public.entities(id) ON DELETE CASCADE;


--
-- Name: framework_business_impacts framework_business_impacts_framework_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.framework_business_impacts
    ADD CONSTRAINT framework_business_impacts_framework_id_fkey FOREIGN KEY (framework_id) REFERENCES public.frameworks(id) ON DELETE CASCADE;


--
-- Name: generated_reports generated_reports_entity_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.generated_reports
    ADD CONSTRAINT generated_reports_entity_id_fkey FOREIGN KEY (entity_id) REFERENCES public.entities(id) ON DELETE CASCADE;


--
-- Name: task_assignments task_assignments_assigned_to_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.task_assignments
    ADD CONSTRAINT task_assignments_assigned_to_fkey FOREIGN KEY (assigned_to) REFERENCES public.users(id) ON DELETE SET NULL;


--
-- Name: task_assignments task_assignments_entity_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.task_assignments
    ADD CONSTRAINT task_assignments_entity_id_fkey FOREIGN KEY (entity_id) REFERENCES public.entities(id) ON DELETE CASCADE;


--
-- Name: task_assignments task_assignments_task_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.task_assignments
    ADD CONSTRAINT task_assignments_task_id_fkey FOREIGN KEY (task_id) REFERENCES public.tasks(id) ON DELETE CASCADE;


--
-- Name: task_evidence task_evidence_document_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.task_evidence
    ADD CONSTRAINT task_evidence_document_id_fkey FOREIGN KEY (document_id) REFERENCES public.documents(id) ON DELETE CASCADE;


--
-- Name: task_evidence task_evidence_task_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.task_evidence
    ADD CONSTRAINT task_evidence_task_id_fkey FOREIGN KEY (task_id) REFERENCES public.tasks(id) ON DELETE CASCADE;


--
-- Name: tasks tasks_assignee_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.tasks
    ADD CONSTRAINT tasks_assignee_id_fkey FOREIGN KEY (assignee_id) REFERENCES public.users(id) ON DELETE SET NULL;


--
-- Name: tasks tasks_control_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.tasks
    ADD CONSTRAINT tasks_control_id_fkey FOREIGN KEY (control_id) REFERENCES public.controls(id) ON DELETE CASCADE;


--
-- Name: team_performance team_performance_entity_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.team_performance
    ADD CONSTRAINT team_performance_entity_id_fkey FOREIGN KEY (entity_id) REFERENCES public.entities(id) ON DELETE CASCADE;


--
-- Name: users users_entity_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_entity_id_fkey FOREIGN KEY (entity_id) REFERENCES public.entities(id) ON DELETE SET NULL;


--
-- Name: users users_organization_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_organization_id_fkey FOREIGN KEY (organization_id) REFERENCES public.organizations(id) ON DELETE CASCADE;


--
-- PostgreSQL database dump complete
--

\unrestrict RyImxgg5LkHOXgCxqZc1SWCBtrBJVQfszTWsSWuDiBhWuvBNWSPb3fQcBDaQrjO

