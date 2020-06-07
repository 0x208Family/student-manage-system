package edu.tyut.controller;

public interface ConstFlg {

    /**
     * indicate whether has login.
     *
     * @see edu.tyut.interceptor.LoginInterceptor
     * @see edu.tyut.aspect.LoginAspect
     */
    String HAS_LOGIN = "hasLogin";

    /**
     * student cookie name
     *
     * @see edu.tyut.interceptor.LoginInterceptor
     * @see edu.tyut.aspect.LoginAspect
     */
    String STUDENT_COOKIE = "tyutStudent";

    /**
     * teacher cookie name
     *
     * @see edu.tyut.interceptor.LoginInterceptor
     * @see edu.tyut.aspect.LoginAspect
     */
    String TEACHER_COOKIE = "tyutTeacher";

    /**
     * manager cookie name
     *
     * @see edu.tyut.interceptor.LoginInterceptor
     * @see edu.tyut.aspect.LoginAspect
     */
    String MANAGER_COOKIE = "tyutManager";

    /**
     * instructor cookie name
     *
     * @see edu.tyut.interceptor.LoginInterceptor
     * @see edu.tyut.aspect.LoginAspect
     */
    String INSTRUCTOR_COOKIE = "tyutInstructor";

    /**
     * indicate whether save login information in client cookie
     */
    String REMEMBER = "remember";

    String STUDENT_HOME = "/stu_home";

    String TEACHER_HOME = "/tea_home";

    String INSTRUCTOR_HOME = "/ins_home";

    String MANAGER_HOME = "/man_home";
}
